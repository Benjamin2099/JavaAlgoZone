import java.util.Arrays;

public class DijkstraExample {
    public static final int INF = Integer.MAX_VALUE; // Unendlich: repräsentiert nicht erreichbare Knoten

    public static void main(String[] args) {
        // Beispielgraph als Adjazenzmatrix (0 = gleiche Knoten, INF = keine direkte Verbindung)
        int[][] graph = {
            {0,   4,   INF, INF, INF, INF, INF, 8,   INF},
            {4,   0,   8,   INF, INF, INF, INF, 11,  INF},
            {INF, 8,   0,   7,   INF, 4,   INF, INF, 2},
            {INF, INF, 7,   0,   9,   14,  INF, INF, INF},
            {INF, INF, INF, 9,   0,   10,  INF, INF, INF},
            {INF, INF, 4,   14,  10,  0,   2,   INF, INF},
            {INF, INF, INF, INF, INF, 2,   0,   1,   6},
            {8,   11,  INF, INF, INF, INF, 1,   0,   7},
            {INF, INF, 2,   INF, INF, INF, 6,   7,   0}
        };
        int startKnoten = 0; // Startpunkt: Lagerhaus 0
        
        int[] distanzen = dijkstra(graph, startKnoten);
        System.out.println("Kürzeste Distanzen vom Knoten " + startKnoten + ": " + Arrays.toString(distanzen));
    }
    
    // Dijkstra's Algorithmus zur Berechnung der kürzesten Wege von 'start' zu allen anderen Knoten
    public static int[] dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] dist = new int[n];            // Array für die kürzesten bekannten Distanzen
        boolean[] visited = new boolean[n];   // Array, um besuchte Knoten zu markieren
        
        // Initialisiere alle Distanzen mit INF, außer dem Startknoten
        Arrays.fill(dist, INF);
        dist[start] = 0;
        
        // Führe n-1 Iterationen durch
        for (int count = 0; count < n - 1; count++) {
            // Wähle den Knoten mit der minimalen Distanz, der noch nicht besucht wurde
            int u = minDistance(dist, visited);
            visited[u] = true; // Markiere den Knoten als besucht
            
            // Aktualisiere die Distanzen der Nachbarknoten
            for (int v = 0; v < n; v++) {
                // Aktualisiere dist[v] nur, wenn es nicht besucht wurde, es eine Verbindung von u zu v gibt
                // und der neue Pfad kürzer ist als der bisher bekannte Pfad
                if (!visited[v] && graph[u][v] != INF &&
                    dist[u] != INF &&
                    dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        return dist;
    }
    
    // Hilfsmethode, die den Index des unbesuchten Knotens mit der minimalen Distanz zurückgibt
    public static int minDistance(int[] dist, boolean[] visited) {
        int min = INF;
        int minIndex = -1;
        
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
