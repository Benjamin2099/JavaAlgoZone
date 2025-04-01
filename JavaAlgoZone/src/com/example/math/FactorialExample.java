public class FactorialExample {
    public static void main(String[] args) {
        int n = 5; // Beispiel: Berechne 5!
        long fakultaet = factorial(n);
        System.out.println("Die Fakultät von " + n + " ist " + fakultaet);
    }
    
    // Rekursive Methode zur Berechnung der Fakultät
    public static long factorial(int n) {
        // Basisfall: 0! = 1
        if (n == 0) {
            return 1;
        } else {
            // Rekursiver Fall: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }
}
