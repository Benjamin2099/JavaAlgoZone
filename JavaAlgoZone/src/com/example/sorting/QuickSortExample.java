public class QuickSortExample {
    public static void main(String[] args) {
        int[] zahlen = {500, 300, 900, 700, 400, 200, 100};
        quickSort(zahlen, 0, zahlen.length - 1);
        
        System.out.println("Sortiertes Array (Quicksort):");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }
    
    // Methode zum Sortieren des Arrays mit Quicksort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partitioniere das Array und erhalte den Index des Pivotelements
            int pivotIndex = partition(array, low, high);
            
            // Sortiere die Elemente vor dem Pivot
            quickSort(array, low, pivotIndex - 1);
            
            // Sortiere die Elemente nach dem Pivot
            quickSort(array, pivotIndex + 1, high);
        }
    }
    
    // Partitionierungsmethode
    public static int partition(int[] array, int low, int high) {
        // Wähle das letzte Element als Pivot
        int pivot = array[high];
        int i = low - 1; // Index des kleineren Elements
        
        // Gehe das Array von low bis high-1 durch
        for (int j = low; j < high; j++) {
            // Wenn das aktuelle Element kleiner oder gleich dem Pivot ist
            if (array[j] <= pivot) {
                i++; // Erhöhe den Index des kleineren Elements
                // Tausche array[i] und array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Tausche das Pivot-Element in die richtige Position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        // Rückgabe des Index, an dem das Pivot nun steht
        return i + 1;
    }
}
