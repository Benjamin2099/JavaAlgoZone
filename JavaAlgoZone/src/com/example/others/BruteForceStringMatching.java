public class BruteForceStringMatching {
    public static void main(String[] args) {
        // Langer Text, in dem gesucht werden soll
        String text = "Dies ist ein einfacher Testtext für String Matching.";
        // Das zu suchende Muster (z. B. ein Wort)
        String pattern = "Testtext";
        
        // Aufruf der Methode zur Muster-Suche
        int index = bruteForceSearch(text, pattern);
        
        // Ausgabe des Ergebnisses
        if (index != -1) {
            System.out.println("Muster \"" + pattern + "\" gefunden an Index: " + index);
        } else {
            System.out.println("Muster \"" + pattern + "\" nicht gefunden.");
        }
    }
    
    // Methode, die das Muster mithilfe der Brute-Force-Methode sucht
    public static int bruteForceSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        
        // Iteriere über jeden möglichen Startindex im Text, wo das Muster passen könnte
        for (int i = 0; i <= n - m; i++) {
            int j;
            // Vergleiche das Muster mit dem Teilstring im Text beginnend bei Index i
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Abbruch, falls ein Zeichen nicht übereinstimmt
                }
            }
            // Wenn alle Zeichen übereinstimmen, wurde das Muster gefunden
            if (j == m) {
                return i;
            }
        }
        // Muster wurde im gesamten Text nicht gefunden
        return -1;
    }
}
