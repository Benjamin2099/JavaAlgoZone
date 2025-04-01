public class PalindromeChecker {
    public static void main(String[] args) {
        String text = "reliefpfeiler"; // Beispiel: "reliefpfeiler" ist ein Palindrom
        // Prüfe, ob der Text ein Palindrom ist
        if (isPalindrome(text)) {
            System.out.println(text + " ist ein Palindrom.");
        } else {
            System.out.println(text + " ist kein Palindrom.");
        }
    }
    
    // Methode zur Überprüfung, ob ein String ein Palindrom ist
    public static boolean isPalindrome(String text) {
        // Entferne Leerzeichen und wandle den Text in Kleinbuchstaben um
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0;                    // Startindex (linke Seite)
        int right = clean.length() - 1;    // Endindex (rechte Seite)
        
        // Solange die Zeiger sich nicht überschneiden:
        while (left < right) {
            // Vergleiche die Zeichen an den Positionen left und right
            if (clean.charAt(left) != clean.charAt(right)) {
                return false; // Zeichen stimmen nicht überein → kein Palindrom
            }
            left++;  // Bewege den linken Zeiger nach rechts
            right--; // Bewege den rechten Zeiger nach links
        }
        return true; // Alle Zeichenpaare stimmen überein
    }
}
