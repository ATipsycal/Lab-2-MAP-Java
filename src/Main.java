import java.util.Arrays;

public class Main {
    public static void main() {
        Aufgabe_1 aufgabe_1 = new Aufgabe_1();
        int[] aufgabe_1_noten_array = {29, 37, 38, 41, 84, 67};
        System.out.println("Nicht ausreichende Noten: " + aufgabe_1.berechneNichtAusreichendeNoten(aufgabe_1_noten_array));
        System.out.println("Durchschnittswert: " + String.format("%.2f", aufgabe_1.durchschnitt(aufgabe_1_noten_array)));
        System.out.println("Abgerundete Noten: " + Arrays.toString(aufgabe_1.abgerundeteNoten(aufgabe_1_noten_array)));
        System.out.println("Maximale abgerundete Note: " + aufgabe_1.maximaleAbgerundeteNote(aufgabe_1_noten_array));
    }
}