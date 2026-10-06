import java.util.ArrayList;
import java.util.List;

public class Aufgabe_1 {
    public List<Integer> berechneNichtAusreichendeNoten(int[] noten)
    {
        List<Integer> nichtAusreichendeNoten = new ArrayList<>();
        int counter = 0;
        for (int i : noten)
            if(i < 40)
            {
                nichtAusreichendeNoten.add(i);
            }
        return nichtAusreichendeNoten;
    }

    public float durchschnitt(int[] noten)
    {
        float sum = 0;
        for (int i : noten)
            sum += i;
        return sum / noten.length;
    }

    public int[] abgerundeteNoten(int[] noten)
    {
        for(int i = 0; i < noten.length; i++)
            if((noten[i] / 5 + 1) * 5 - noten[i] < 3 && noten[i] >= 38)
                noten[i] = (noten[i] / 5 + 1) * 5;
        return noten;
    }

    public int maximaleAbgerundeteNote(int[] noten)
    {
        int max = 0;
        noten = abgerundeteNoten(noten);
        for (int i : noten)
            if (i > max)
                max = i;
        return max;
    }

}
