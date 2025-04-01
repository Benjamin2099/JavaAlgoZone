public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // Berechne die 10. Fibonacci-Zahl
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
    
    // Iterative Methode zur Berechnung der n-ten Fibonacci-Zahl
    public static int fibonacci(int n) {
        // Wenn n 0 oder 1 ist, direkt zurückgeben
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int fib0 = 0;  // Fib(0)
        int fib1 = 1;  // Fib(1)
        int fibN = 0;  // Variable für Fib(n)
        
        // Schleife von 2 bis n, um die Folge aufzubauen
        for (int i = 2; i <= n; i++) {
            fibN = fib0 + fib1; // Berechne Fib(i)
            fib0 = fib1;        // Verschiebe die Werte: fib0 wird zum vorherigen fib1
            fib1 = fibN;        // fib1 erhält den aktuellen Wert
        }
        return fibN;
    }
}
