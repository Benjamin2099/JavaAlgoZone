public class InsertionSortExample {
    public static void main(String[] args) {
        // Beispiel-Array, das sortiert werden soll
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        // Aufruf der Insertion-Sort-Methode
        insertionSort(arr);
        
        // Ausgabe des sortierten Arrays
        System.out.println("Sortiertes Array (Insertion Sort):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    // Methode zum Sortieren des Arrays mittels Insertion Sort
    public static void insertionSort(int[] arr) {
        // Starte bei Index 1, da das erste Element als sortiert gilt
        for (int i = 1; i < arr.length; i++) {
            // Schlüssel (das aktuelle Element, das sortiert werden soll)
            int key = arr[i];
            // Setze den Index j auf den vorherigen Index von i
            int j = i - 1;
            
            // Verschiebe alle Elemente, die größer als key sind, um eine Position nach rechts
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Verschiebe das Element
                j--;                  // Gehe ein Element weiter nach links
            }
            // Setze den key an die richtige Stelle
            arr[j + 1] = key;
        }
    }
}
