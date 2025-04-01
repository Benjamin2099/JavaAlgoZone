import java.util.Arrays;

public class SieveEratosthenesExample {
    public static void main(String[] args) {
        int n = 50; // Finde alle Primzahlen bis 50
        boolean[] isPrime = sieveOfEratosthenes(n);
        
        System.out.println("Primzahlen bis " + n + ":");
        // Iteriere über das boolean-Array, ab Index 2 (0 und 1 sind keine Primzahlen)
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
    
    // Methode, die ein boolean-Array zurückgibt, in dem true anzeigt, dass die Zahl prim ist
    public static boolean[] sieveOfEratosthenes(int n) {
        // Erstelle ein Array, in dem alle Werte initial auf true gesetzt werden
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        // 0 und 1 sind keine Primzahlen
        prime[0] = false;
        prime[1] = false;
        
        // Gehe Zahlen von 2 bis zur Quadratwurzel von n durch
        for (int p = 2; p * p <= n; p++) {
            // Wenn p als prim markiert ist
            if (prime[p]) {
                // Markiere alle Vielfachen von p als nicht prim, beginnend mit p*p
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }
}
