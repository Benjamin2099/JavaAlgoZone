import java.util.ArrayList;
import java.util.Stack;

public class IterativeDFS {
    public static void main(String[] args) {
        int vertices = 6; // Anzahl der Knoten im Graphen
        
        // Erstelle eine Adjazenzliste zur Darstellung des Graphen
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Beispielgraph (ungerichteter Graph):
        // Kanten: 0-1, 0-2, 1-3, 2-4, 2-5
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(4);
        graph.get(2).add(5);
        graph.get(3).add(1);
        graph.get(4).add(2);
        graph.get(5).add(2);
        
        System.out.println("Iterative DFS Traversierung ab Knoten 0:");
        iterativeDFS(graph, 0, vertices);
    }
    
    // Methode zur iterativen DFS Traversierung mittels Stack
    public static void iterativeDFS(ArrayList<ArrayList<Integer>> graph, int start, int vertices) {
        // Array, um zu merken, welche Knoten bereits besucht wurden
        boolean[] visited = new boolean[vertices];
        // Erstelle einen Stack, um die Knoten zu verwalten (LIFO-Struktur)
        Stack<Integer> stack = new Stack<>();
        
        // Starte mit dem Startknoten: Füge ihn dem Stack hinzu
        stack.push(start);
        
        // Solange der Stack nicht leer ist:
        while (!stack.isEmpty()) {
            int current = stack.pop(); // Nimm den obersten Knoten aus dem Stack
            
            // Wenn der Knoten noch nicht besucht wurde:
            if (!visited[current]) {
                visited[current] = true;       // Markiere ihn als besucht
                System.out.print(current + " "); // Ausgabe des aktuellen Knotens
                
                // Füge alle unbesuchten Nachbarknoten hinzu
                // Um eine DFS-Reihenfolge zu erhalten, füge die Nachbarn in umgekehrter Reihenfolge hinzu
                ArrayList<Integer> neighbors = graph.get(current);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        System.out.println(); // Zeilenumbruch nach der Traversierung
    }
}
