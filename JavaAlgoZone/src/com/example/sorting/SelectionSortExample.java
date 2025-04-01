public class SelectionSortExample {
    public static void main(String[] args) {
        // Beispiel-Array, das sortiert werden soll
        int[] arr = {64, 25, 12, 22, 11};
        
        // Aufruf der Selection-Sort-Methode
        selectionSort(arr);
        
        // Ausgabe des sortierten Arrays
        System.out.println("Sortiertes Array (Selection Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    // Methode zum Sortieren des Arrays mittels Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // Äußere Schleife: Durchlaufe das Array von Anfang bis vor dem letzten Element
        for (int i = 0; i < n - 1; i++) {
            // Setze das aktuelle Element als Minimum
            int minIndex = i;
            // Innere Schleife: Suche das kleinste Element im unsortierten Teil
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Aktualisiere den Index des kleinsten Elements
                }
            }
            // Tausche das kleinste gefundene Element mit dem ersten unsortierten Element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
