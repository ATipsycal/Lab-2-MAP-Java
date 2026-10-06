import java.util.Arrays;

public class Main {
    public static void main() {
        Aufgabe_1 aufgabe_1 = new Aufgabe_1();
        int[] aufgabe_1_noten_array = {29, 37, 38, 41, 84, 67};
        System.out.println("Nicht ausreichende Noten: " + aufgabe_1.berechneNichtAusreichendeNoten(aufgabe_1_noten_array));
        System.out.println("Durchschnittswert: " + String.format("%.2f", aufgabe_1.durchschnitt(aufgabe_1_noten_array)));
        System.out.println("Abgerundete Noten: " + Arrays.toString(aufgabe_1.abgerundeteNoten(aufgabe_1_noten_array)));
        System.out.println("Maximale abgerundete Note: " + aufgabe_1.maximaleAbgerundeteNote(aufgabe_1_noten_array));

        int[] aufgabe_2_zahlen_array = {4, 8, 3, 10, 17};
        Aufgabe_2 aufgabe_2 = new Aufgabe_2(aufgabe_2_zahlen_array);
        System.out.println();
        System.out.println("Maximale Zahl: " + aufgabe_2.maximaleZahl());
        System.out.println("Minimale Zahl: " + aufgabe_2.minimaleZahl());
        System.out.println("Maximale Summe n-1 Zahlen: " + aufgabe_2.maximaleSumme());
        System.out.println("Minimale Summe n-1 Zahlen: " + aufgabe_2.minimaleSumme());
    }
}