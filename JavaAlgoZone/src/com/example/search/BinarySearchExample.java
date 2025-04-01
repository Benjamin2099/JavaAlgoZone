public class BinarySearchExample {
    public static void main(String[] args) {
        // Sortiertes Array von Integern
        int[] zahlen = {100, 200, 300, 400, 500, 700, 900};
        int ziel = 400; // Das zu suchende Element
        
        // Aufruf der iterativen Binärsuche
        int index = binarySearch(zahlen, ziel);
        
        // Ausgabe des Ergebnisses
        if (index != -1) {
            System.out.println("Element " + ziel + " gefunden an Index: " + index);
        } else {
            System.out.println("Element " + ziel + " nicht gefunden.");
        }
    }
    
    // Methode für die iterative Binärsuche
    public static int binarySearch(int[] array, int ziel) {
        int links = 0;                 // Startindex des Suchbereichs
        int rechts = array.length - 1; // Endindex des Suchbereichs
        
        while (links <= rechts) {
            int mitte = links + (rechts - links) / 2; // Berechne den mittleren Index
            
            if (array[mitte] == ziel) {
                return mitte; // Element gefunden
            }
            if (array[mitte] < ziel) {
                links = mitte + 1; // Suche im rechten Teilbereich weiter
            } else {
                rechts = mitte - 1; // Suche im linken Teilbereich weiter
            }
        }
        return -1; // Element wurde nicht gefunden
    }
}
