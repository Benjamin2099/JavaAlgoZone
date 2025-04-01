import java.util.ArrayList;
import java.util.List;

public class DFSExample {
    // Klasse zur Darstellung eines Knotens in einer Baumstruktur
    static class TreeNode {
        String name;               // Name des Ordners oder der Datei
        List<TreeNode> children;   // Liste der Unterordner bzw. Dateien
        
        TreeNode(String name) {
            this.name = name;
            this.children = new ArrayList<>();
        }
        
        // Methode zum Hinzufügen eines Kindes
        public void addChild(TreeNode child) {
            children.add(child);
        }
    }
    
    public static void main(String[] args) {
        // Aufbau einer Beispiel-Dateistruktur
        TreeNode root = new TreeNode("root");
        TreeNode folderA = new TreeNode("FolderA");
        TreeNode folderB = new TreeNode("FolderB");
        TreeNode file1 = new TreeNode("File1.txt");
        TreeNode file2 = new TreeNode("File2.txt");
        TreeNode file3 = new TreeNode("File3.txt");
        
        // Ordnerstruktur: root -> FolderA, FolderB; FolderA -> File1.txt, File2.txt; FolderB -> File3.txt
        root.addChild(folderA);
        root.addChild(folderB);
        folderA.addChild(file1);
        folderA.addChild(file2);
        folderB.addChild(file3);
        
        System.out.println("DFS Traversierung der Dateistruktur:");
        dfs(root);
    }
    
    // Rekursive Methode zur DFS Traversierung des Baumes
    public static void dfs(TreeNode node) {
        if (node == null) return;
        // Verarbeite den aktuellen Knoten (hier: drucke den Namen)
        System.out.println(node.name);
        // Rufe DFS für jeden untergeordneten Knoten auf
        for (TreeNode child : node.children) {
            dfs(child);
        }
    }
}
