public class GCDExample {
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        // Berechne den GGT von a und b
        int gcd = computeGCD(a, b);
        System.out.println("Der größte gemeinsame Teiler von " + a + " und " + b + " ist " + gcd);
    }
    
    // Methode zur Berechnung des GGT mittels Euklidischem Algorithmus
    public static int computeGCD(int a, int b) {
        // Solange b nicht 0 ist, wiederhole den Vorgang:
        while (b != 0) {
            int temp = b;       // Speichere b zwischen
            b = a % b;          // b wird der Rest der Division von a durch b
            a = temp;           // a erhält den bisherigen Wert von b
        }
        // Wenn b 0 ist, enthält a den GGT
        return a;
    }
}
