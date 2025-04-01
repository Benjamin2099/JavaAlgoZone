import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {
        // Beispielausdruck: Korrekte Klammerung
        String expression = "{[()]}";
        // Beispielausdruck: Falsche Klammerung
        String badExpression = "{[(])}";
        
        System.out.println("Expression: " + expression + " ist " +
                           (isBalanced(expression) ? "korrekt" : "nicht korrekt") + " geklammert.");
        System.out.println("Expression: " + badExpression + " ist " +
                           (isBalanced(badExpression) ? "korrekt" : "nicht korrekt") + " geklammert.");
    }
    
    // Methode zur Überprüfung, ob ein Ausdruck korrekt geklammert ist
    public static boolean isBalanced(String expression) {
        // Erstelle einen Stack zum Speichern der geöffneten Klammern
        Stack<Character> stack = new Stack<>();
        
        // Gehe jeden Charakter des Ausdrucks durch
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            // Falls eine öffnende Klammer gefunden wird, lege sie in den Stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Falls eine schließende Klammer gefunden wird:
            else if (ch == ')' || ch == ']' || ch == '}') {
                // Wenn der Stack leer ist, gibt es keine passende öffnende Klammer
                if (stack.isEmpty()) {
                    return false;
                }
                // Poppe das letzte Element aus dem Stack
                char last = stack.pop();
                // Prüfe, ob die geschlossene Klammer zum geöffneten Element passt
                if (!isMatchingPair(last, ch)) {
                    return false;
                }
            }
        }
        // Am Ende muss der Stack leer sein (alle Klammern geschlossen)
        return stack.isEmpty();
    }
    
    // Hilfsmethode, die prüft, ob zwei Klammern zueinander passen
    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
