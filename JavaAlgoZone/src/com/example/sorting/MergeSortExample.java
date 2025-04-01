public class MergeSortExample {
    public static void main(String[] args) {
        int[] zahlen = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(zahlen, 0, zahlen.length - 1);
        
        System.out.println("Sortiertes Array (Merge Sort):");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }
    
    // Methode zur Durchführung von Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Berechne den mittleren Index
            int middle = left + (right - left) / 2;
            
            // Sortiere den linken Teil des Arrays
            mergeSort(arr, left, middle);
            // Sortiere den rechten Teil des Arrays
            mergeSort(arr, middle + 1, right);
            
            // Führe die beiden sortierten Teile zusammen
            merge(arr, left, middle, right);
        }
    }
    
    // Methode zum Zusammenführen zweier sortierter Teilarrays
    public static void merge(int[] arr, int left, int middle, int right) {
        // Berechne die Größen der beiden Teilarrays
        int n1 = middle - left + 1;
        int n2 = right - middle;
        
        // Erstelle temporäre Arrays für die beiden Hälften
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Kopiere die Daten in die temporären Arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[middle + 1 + j];
        
        // Initialisiere Indizes für leftArray, rightArray und das zusammengeführte Array
        int i = 0, j = 0;
        int k = left;
        
        // Merge: Vergleiche Elemente und kopiere das kleinere Element in das Originalarray
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Kopiere die restlichen Elemente aus leftArray, falls vorhanden
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Kopiere die restlichen Elemente aus rightArray, falls vorhanden
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
