# JavaAlgoZone

Dieses Repository enthält eine Sammlung von Java-Algorithmus-Beispielen, die verschiedene grundlegende Algorithmen und Datenstrukturen demonstrieren. Die Beispiele sind thematisch in verschiedene Kategorien unterteilt und dienen als Lernressource – etwa zur Vorbereitung auf Prüfungen (z. B. IHK Fachinformatiker Anwendungsentwicklung) oder zum Üben von Algorithmen.

## Inhalt

Die Beispiele decken folgende Themenbereiche ab:

- **Sorting (Sortieralgorithmen):**  
  Beispiele, die zeigen, wie Daten (Arrays oder Listen) sortiert werden können.  
  - **Bubble Sort:** Vergleicht benachbarte Elemente und tauscht sie, falls sie in der falschen Reihenfolge stehen.  
  - **Insertion Sort:** Baut die sortierte Liste schrittweise auf, indem jedes Element in die richtige Position eingefügt wird.  
  - **Quick Sort:** Nutzt einen rekursiven Ansatz, um das Array anhand eines Pivot-Elements zu partitionieren.  
  - **Selection Sort:** Findet das kleinste Element im unsortierten Teil und tauscht es an die korrekte Position.  
  - **Merge Sort:** Teilt das Array rekursiv in kleinere Arrays, sortiert diese und fügt sie wieder zusammen.  
  - **Counting Sort:** Zählt Vorkommen innerhalb eines begrenzten Wertebereichs und baut das sortierte Array anhand der Zählwerte auf.

- **Search (Suchalgorithmen):**  
  Algorithmen zur Suche von Elementen in Datenstrukturen oder Texten.  
  - **Binary Search:** Durch halbieren des Suchbereichs wird in einem sortierten Array effizient gesucht.  
  - **Linear Search:** Durchläuft ein Array elementweise, bis das Ziel gefunden ist.  
  - **Brute-Force String Matching:** Vergleicht Zeichen für Zeichen, um ein Muster in einem Text zu finden.

- **Math (Mathematische Algorithmen und Rekursion):**  
  Enthält Beispiele für mathematische Berechnungen und rekursive Algorithmen.  
  - **Fakultätsberechnung:** Rekursive Berechnung von n! (Fakultät).  
  - **Rekursive Exponentiation:** Berechnet Potenzen (a^b) rekursiv.  
  - **Quersummenberechnung:** Addiert alle Ziffern einer Zahl.  
  - **Fibonacci (rekursiv und iterativ):** Berechnet die Fibonacci-Zahlen, beide Varianten sind enthalten.

- **Graph (Graphalgorithmen):**  
  Algorithmen zur Analyse und Verarbeitung von Graphen, wie zur Ermittlung von kürzesten Pfaden oder zur Netzwerkoptimierung.  
  - **Dijkstra:** Findet den kürzesten Weg in einem gewichteten Graphen.  
  - **Prim:** Berechnet den minimal aufspannenden Baum (Minimum Spanning Tree) eines Graphen, nützlich z. B. für Kostenoptimierungen in Netzwerken.  
  - **Topologisches Sortieren:** Sortiert einen gerichteten, azyklischen Graphen, ideal für die Planung von Aufgaben, bei denen Abhängigkeiten bestehen.

- **Union-Find (Disjoint Set):**  
  Verwaltung von disjunkten Mengen zur effizienten Zyklenerkennung in Graphen.  
  - **Union-Find/Disjoint Set:** Erkennt Zyklen, wenn das Hinzufügen einer neuen Verbindung zu einem bereits verbundenen Knoten führt.

- **DFS/BFS (Graph-Traversierung):**  
  Algorithmen zur Durchsuchung von Graphen, entweder in der Breite (BFS) oder in der Tiefe (DFS).  
  - **BFS (Breadth-First Search):** Besucht alle Knoten in der Reihenfolge ihrer Entfernung vom Startknoten – nützlich für die Ermittlung kürzester Wege.  
  - **DFS (Depth-First Search):** Kann sowohl rekursiv als auch iterativ implementiert werden und besucht alle Knoten eines Graphen, indem es so tief wie möglich in einen Zweig vordringt, bevor es zurückspringt.

- **Others (Weitere Algorithmen und Szenarien):**  
  Diese Kategorie fasst diverse Algorithmen zusammen, die in speziellen Anwendungsszenarien vorkommen.  
  - **Sieve of Eratosthenes:** Ein Primzahlsieb, das alle Primzahlen bis zu einem bestimmten Grenzwert findet.  
  - **Palindrome Checker:** Überprüft, ob ein String vorwärts und rückwärts gleich gelesen wird.  
  - **0/1-Knapsack-Problem:** Löst mithilfe dynamischer Programmierung ein Optimierungsproblem, z. B. für die Auswahl von Produkten in einem Warenkorb.  
  - **GCD (Greatest Common Divisor):** Berechnet den größten gemeinsamen Teiler zweier Zahlen mittels des Euklidischen Algorithmus.  
  - **Weitere Beispiele:** Weitere Algorithmen oder alternative Implementierungen, wie verschiedene Varianten der DFS (rekursiv vs. iterativ) oder zusätzliche Suchalgorithmen.

## Verzeichnisstruktur
JavaAlgoZone/                  <-- Main repository folder
├── README.md                  <-- Project description and usage instructions
├── .gitignore                 <-- Git configuration file (e.g., to exclude IDE-specific files)
└── src/                       <-- Source code folder
    └── com/
        └── example/
            ├── sorting/           <-- Sorting algorithms
            ├── search/            <-- Search algorithms
            ├── math/              <-- Mathematical and recursive algorithms
            ├── graph/             <-- Graph algorithms
            ├── unionfind/         <-- Union-Find for cycle detection in graphs
            ├── dfs_bfs/           <-- Graph traversal algorithms (DFS and BFS)
            └── others/            <-- Additional algorithms and special scenarios

## Installation und Nutzung

1. **Lokale Ausführung:**  
   - Lade das Repository auf deinen Computer herunter.
   - Öffne das Projekt in deiner bevorzugten Java-IDE (z. B. IntelliJ IDEA oder Eclipse) und importiere das Verzeichnis `src` als Java-Projekt.
   - Navigiere zu dem gewünschten Unterordner und führe die `main`-Methode der entsprechenden Beispielklasse aus.

2. **GitHub:**  
   Dieses Repository ist für die Zusammenarbeit gedacht. Du kannst Issues eröffnen, Pull Requests senden oder das Repository forken, um es weiter zu verbessern.

## Beiträge

Beiträge zu diesem Repository sind willkommen! Wenn du:
- Verbesserungen oder Optimierungen an den Algorithmen hast,
- Neue Beispiele hinzufügen möchtest oder
- Fehler findest,
