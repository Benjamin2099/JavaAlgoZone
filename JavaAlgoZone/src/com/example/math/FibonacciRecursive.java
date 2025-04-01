public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 10; // Berechne die 10. Fibonacci-Zahl
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
    
    // Rekursive Methode zur Berechnung der n-ten Fibonacci-Zahl
    public static int fibonacci(int n) {
        // Basisfälle: Fib(0)=0 und Fib(1)=1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Rekursiver Fall: Summe der beiden vorherigen Fibonacci-Zahlen
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
