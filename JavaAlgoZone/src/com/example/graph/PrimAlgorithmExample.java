import java.util.*;

public class PrimAlgorithmExample {
    public static void main(String[] args) {
        // Beispielgraph als Adjazenzmatrix (Kantenkosten)
        // 0: Standort A, 1: Standort B, 2: Standort C, 3: Standort D
        int[][] graph = {
            {0, 2, 0, 6},
            {2, 0, 3, 8},
            {0, 3, 0, 0},
            {6, 8, 0, 0}
        };
        
        // Berechne den minimal aufspannenden Baum (MST) mit Prim's Algorithmus
        primMST(graph);
    }
    
    // Methode zur Berechnung des MST mittels Prim's Algorithmus
    public static void primMST(int[][] graph) {
        int V = graph.length; // Anzahl der Knoten
        int[] parent = new int[V]; // Array zur Speicherung des MST
        int[] key = new int[V];    // Schlüsselwerte zur Auswahl des minimalen Kantenwerts
        boolean[] mstSet = new boolean[V]; // Array, um zu markieren, welche Knoten im MST sind
        
        // Initialisiere alle Schlüssel mit unendlich und mstSet mit false
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mstSet, false);
        
        // Der erste Knoten wird als Wurzel gewählt; sein Schlüssel wird auf 0 gesetzt
        key[0] = 0;
        parent[0] = -1; // Der Wurzelknoten hat keinen Elternteil
        
        // MST enthält V Knoten
        for (int count = 0; count < V - 1; count++) {
            // Wähle den Knoten mit dem minimalen Schlüssel, der noch nicht im MST ist
            int u = minKey(key, mstSet, V);
            mstSet[u] = true; // Füge den ausgewählten Knoten dem MST hinzu
            
            // Aktualisiere den Schlüssel und den Elternteil der Nachbarn von u
            for (int v = 0; v < V; v++) {
                // Wenn es eine Verbindung gibt und v noch nicht im MST ist und graph[u][v] kleiner als key[v] ist
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        
        // Ausgabe des minimal aufspannenden Baumes
        System.out.println("Kante \tGewicht");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }
    
    // Hilfsmethode zur Auswahl des Knotens mit dem minimalen Schlüsselwert, der noch nicht im MST ist
    public static int minKey(int[] key, boolean[] mstSet, int V) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
}
