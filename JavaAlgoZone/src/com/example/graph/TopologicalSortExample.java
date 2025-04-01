import java.util.*;

public class TopologicalSortExample {
    public static void main(String[] args) {
        // Beispiel: Aufgaben und ihre Abhängigkeiten in einem Projekt
        // Knoten repräsentieren Aufgaben (0: "Konzept", 1: "Design", 2: "Implementierung", 3: "Testen", 4: "Deployment")
        int numTasks = 5;
        
        // Erstelle eine Adjazenzliste, um die gerichteten Abhängigkeiten darzustellen
        // Zum Beispiel: Von Aufgabe 0 ("Konzept") geht eine Kante zu Aufgabe 1 ("Design")
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numTasks; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1); // Konzept -> Design
        graph.get(0).add(2); // Konzept -> Implementierung
        graph.get(1).add(3); // Design -> Testen
        graph.get(2).add(3); // Implementierung -> Testen
        graph.get(3).add(4); // Testen -> Deployment
        
        // Führe topologisches Sortieren durch
        List<Integer> sortedOrder = topologicalSort(graph, numTasks);
        
        // Ausgabe der sortierten Aufgaben
        if (sortedOrder != null) {
            System.out.println("Topologisch sortierte Aufgaben:");
            for (int task : sortedOrder) {
                System.out.print(task + " ");
            }
        } else {
            System.out.println("Es gibt einen Zyklus im Graphen – topologische Sortierung nicht möglich.");
        }
    }
    
    // Methode für topologisches Sortieren mittels Kahn-Algorithmus
    public static List<Integer> topologicalSort(List<List<Integer>> graph, int numTasks) {
        int[] inDegree = new int[numTasks]; // Array zur Speicherung der Eingangsgrade jedes Knotens
        
        // Berechne die Eingangsgrade für jeden Knoten
        for (int i = 0; i < numTasks; i++) {
            for (int neighbor : graph.get(i)) {
                inDegree[neighbor]++;
            }
        }
        
        // Queue für alle Knoten mit Eingangsgrad 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numTasks; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        
        List<Integer> sortedOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            sortedOrder.add(current);
            
            // Reduziere den Eingangsgrad der Nachbarn und füge Knoten mit inDegree 0 der Queue hinzu
            for (int neighbor : graph.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        
        // Wenn die sortierte Reihenfolge alle Aufgaben enthält, war der Graph azyklisch
        return sortedOrder.size() == numTasks ? sortedOrder : null;
    }
}
