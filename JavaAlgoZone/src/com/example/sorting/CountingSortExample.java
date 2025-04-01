public class CountingSortExample {
    public static void main(String[] args) {
        // Beispiel-Array: Noten eines Tests (Werte zwischen 0 und 100)
        int[] scores = {88, 75, 90, 75, 100, 65, 88, 75};
        
        // Aufruf der Counting-Sort-Methode
        countingSort(scores, 0, 100);
        
        // Ausgabe des sortierten Arrays
        System.out.println("Sortierte Testergebnisse (Counting Sort):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
    
    // Methode zur Durchführung des Counting Sorts
    public static void countingSort(int[] arr, int min, int max) {
        // Bestimme den Wertebereich (z. B. 0 bis 100)
        int range = max - min + 1;
        // Erstelle ein Hilfsarray, das die Häufigkeit jedes Wertes speichert
        int[] count = new int[range];
        
        // Zähle das Vorkommen jedes Elements im Array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        
        // Überschreibe das ursprüngliche Array mit den sortierten Werten
        int index = 0;
        for (int i = 0; i < range; i++) {
            // Füge den Wert (i + min) so oft hinzu, wie er gezählt wurde
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }
}
