public class LinearSearchExample {
    public static void main(String[] args) {
        // Beispiel-Array
        int[] zahlen = {5, 8, 12, 16, 23, 42};
        int ziel = 16; // Gesuchtes Element
        
        // Aufruf der Linear Search-Methode
        int index = linearSearch(zahlen, ziel);
        
        // Ergebnis ausgeben
        if (index != -1) {
            System.out.println("Element " + ziel + " gefunden an Index: " + index);
        } else {
            System.out.println("Element " + ziel + " nicht gefunden.");
        }
    }
    
    // Methode zur linearen Suche in einem Array
    public static int linearSearch(int[] arr, int ziel) {
        // Iteriere über jedes Element im Array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ziel) { // Vergleiche das Element mit dem Ziel
                return i; // Element gefunden, Index zurückgeben
            }
        }
        return -1; // Element nicht gefunden, -1 zurückgeben
    }
}
