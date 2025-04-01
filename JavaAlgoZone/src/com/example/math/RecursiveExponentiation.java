public class RecursiveExponentiation {
    public static void main(String[] args) {
        int basis = 2;
        int exponent = 10;
        long result = power(basis, exponent);
        System.out.println(basis + " hoch " + exponent + " = " + result);
    }
    
    // Rekursive Methode zur Berechnung von a^b
    public static long power(int a, int b) {
        // Basisfall: Jede Zahl hoch 0 ist 1
        if (b == 0) {
            return 1;
        }
        // Rekursiver Fall: a^b = a * a^(b-1)
        return a * power(a, b - 1);
    }
}
