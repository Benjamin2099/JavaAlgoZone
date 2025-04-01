public class BubbleSortExample {
    public static void main(String[] args) {
        // Array von Integern, das sortiert werden soll
        int[] zahlen = {500, 300, 900, 700, 400, 200, 100};

        // Äußere Schleife: Wiederhole den Sortiervorgang n-1 Mal (n = Länge des Arrays)
        for (int j = 0; j < zahlen.length - 1; j++) {
            // Innere Schleife: Vergleiche benachbarte Elemente im unsortierten Teil des Arrays
            for (int i = 0; i < zahlen.length - 1 - j; i++) {
                // Wenn das aktuelle Element größer als das nächste ist, tausche sie
                if (zahlen[i] > zahlen[i + 1]) {
                    int temp = zahlen[i];       // Speichere das aktuelle Element zwischen
                    zahlen[i] = zahlen[i + 1];    // Setze das nächste Element an die aktuelle Position
                    zahlen[i + 1] = temp;         // Setze das gespeicherte Element an die nächste Position
                }
            }
        }

        // Ausgabe des sortierten Arrays
        System.out.println("Sortiertes Array (Bubble Sort):");
        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }
}
