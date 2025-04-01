import java.util.ArrayList;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        // Beispielbetrag in Cent
        int amount = 87;
        // Verfügbare Münzen (in Cent) – absteigend sortiert
        int[] coins = {50, 20, 10, 5, 2, 1};
        
        List<Integer> change = getCoinChange(amount, coins);
        System.out.println("Wechselgeld für " + amount + " Cent:");
        for (int coin : change) {
            System.out.print(coin + " ");
        }
    }
    
    // Methode, die mit der Greedy-Methode den Münzwechsel berechnet
    public static List<Integer> getCoinChange(int amount, int[] coins) {
        List<Integer> result = new ArrayList<>();
        // Gehe alle Münzwerte in absteigender Reihenfolge durch
        for (int coin : coins) {
            // Solange der Betrag größer oder gleich der aktuellen Münze ist:
            while (amount >= coin) {
                result.add(coin); // Füge die Münze der Ergebnisliste hinzu
                amount -= coin;   // Reduziere den Betrag um den Wert der Münze
            }
        }
        return result;
    }
}
