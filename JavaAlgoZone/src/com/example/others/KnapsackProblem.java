public class KnapsackProblem {
    public static void main(String[] args) {
        // Gewichte der Produkte (z. B. in kg)
        int[] weights = {2, 3, 4, 5};
        // Werte der Produkte (z. B. in Euro)
        int[] values = {3, 4, 5, 6};
        int capacity = 5; // Maximale Kapazität des Warenkorbs
        int n = weights.length;
        
        // Berechne den maximalen Wert, der in den Warenkorb passt
        int maxValue = knapsack(capacity, weights, values, n);
        System.out.println("Maximaler Wert, der in den Warenkorb passt: " + maxValue);
    }
    
    // Methode zur Lösung des 0/1-Knapsack-Problems mittels dynamischer Programmierung
    public static int knapsack(int capacity, int[] weights, int[] values, int n) {
        // Erstelle eine DP-Tabelle, wobei dp[i][w] den maximalen Wert darstellt, der mit i Produkten und Kapazität w erreicht werden kann
        int[][] dp = new int[n + 1][capacity + 1];
        
        // Fülle die DP-Tabelle
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0; // Basisfall: Kein Produkt oder Kapazität 0
                } else if (weights[i - 1] <= w) {
                    // Entscheidung: Produkt aufnehmen oder nicht
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w]; // Produkt zu schwer → nicht aufnehmen
                }
            }
        }
        return dp[n][capacity]; // Maximale Wert, der mit n Produkten und gegebener Kapazität erreicht werden kann
    }
}
