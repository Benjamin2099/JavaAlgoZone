import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {
    public static void main(String[] args) {
        // Anzahl der Knoten im Graph
        int vertices = 6;
        
        // Erstelle eine Adjazenzliste zur Darstellung des Graphen
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Füge Kanten hinzu (ungerichteter Graph)
        // Beispielgraph: 0 - 1, 0 - 2, 1 - 3, 2 - 3, 3 - 4, 4 - 5
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(3);
        graph.get(4).add(5);
        graph.get(5).add(4);
        
        System.out.println("BFS Traversierung des Graphen ab Knoten 0:");
        bfs(graph, 0, vertices);
    }
    
    // Methode zur Durchführung einer BFS Traversierung
    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start, int vertices) {
        // Array, um zu merken, welche Knoten bereits besucht wurden
        boolean[] visited = new boolean[vertices];
        // Queue für BFS (FIFO-Struktur)
        Queue<Integer> queue = new LinkedList<>();
        
        // Starte mit dem Startknoten: markiere ihn als besucht und füge ihn der Queue hinzu
        visited[start] = true;
        queue.add(start);
        
        // Solange die Queue nicht leer ist, verarbeite die Knoten
        while (!queue.isEmpty()) {
            int current = queue.poll(); // Entferne den Knoten am Anfang der Queue
            System.out.print(current + " ");
            
            // Gehe alle Nachbarknoten des aktuellen Knotens durch
            for (int neighbor : graph.get(current)) {
                // Falls der Nachbar noch nicht besucht wurde, markiere ihn und füge ihn der Queue hinzu
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println(); // Neue Zeile nach der Traversierung
    }
}
