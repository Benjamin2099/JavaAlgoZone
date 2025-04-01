public class DigitSumExample {
    public static void main(String[] args) {
        int number = 12345; // Beispielzahl
        // Berechne die Quersumme der Zahl
        int sum = digitSum(number);
        System.out.println("Die Quersumme von " + number + " ist " + sum);
    }
    
    // Methode zur Berechnung der Quersumme einer Zahl
    public static int digitSum(int number) {
        int sum = 0;
        // Solange die Zahl größer als 0 ist:
        while (number > 0) {
            // Füge die letzte Ziffer (number % 10) zur Summe hinzu
            sum += number % 10;
            // Entferne die letzte Ziffer, indem du die Zahl durch 10 teilst
            number = number / 10;
        }
        return sum;
    }
}
