
public class UnionFindExample {
    public static void main(String[] args) {
        // Beispielgraph mit Kanten: Jede Kante ist ein Paar (u, v)
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 3},
            {3, 4},
            {4, 1}  // Diese Kante erzeugt einen Zyklus (1-2-3-4-1)
        };
        int numVertices = 5;
        
        // Überprüfe, ob der Graph einen Zyklus enthält
        boolean hasCycle = isCycle(numVertices, edges);
        System.out.println("Der Graph " + (hasCycle ? "enthält" : "enthält keinen") + " Zyklus.");
    }
    
    // Methode zur Zyklenerkennung mittels Union-Find
    public static boolean isCycle(int numVertices, int[][] edges) {
        // Eltern-Array für die Union-Find-Struktur
        int[] parent = new int[numVertices];
        // Initialisiere jeden Knoten als eigenen Elternteil
        for (int i = 0; i < numVertices; i++) {
            parent[i] = -1;
        }
        
        // Verarbeite jede Kante
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            // Finde die Repräsentanten der Mengen, zu denen u und v gehören
            int setU = find(parent, u);
            int setV = find(parent, v);
            
            // Wenn beide Knoten im gleichen Set sind, entsteht ein Zyklus
            if (setU == setV) {
                return true;
            }
            // Vereinige die Mengen
            union(parent, setU, setV);
        }
        return false;
    }
    
    // Findet die Wurzel des Sets, zu dem element i gehört (mit Pfadkompression)
    public static int find(int[] parent, int i) {
        if (parent[i] == -1) {
            return i;
        }
        // Rekursive Pfadkompression
        return parent[i] = find(parent, parent[i]);
    }
    
    // Vereinigt zwei Mengen, indem der Wurzelknoten des einen Sets auf den Wurzelknoten des anderen zeigt
    public static void union(int[] parent, int x, int y) {
        int xSet = find(parent, x);
        int ySet = find(parent, y);
        if (xSet != ySet) {
            parent[xSet] = ySet;
        }
    }
}
