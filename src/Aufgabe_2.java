import java.util.Arrays;

public class Aufgabe_2 {
    int[] zahlen;
    public Aufgabe_2(int[] zahlen)
    {
        this.zahlen = zahlen;
    }

    public int maximaleZahl()
    {
        int max = this.zahlen[0];
        for(int i: this.zahlen)
            if(i > max)
                max = i;
        return max;
    }

    public int minimaleZahl()
    {
        int min = this.zahlen[0];
        for(int i: this.zahlen)
            if(i > min)
                min = i;
        return min;
    }

    public int maximaleSumme()
    {
        int[] zahlen_sorted = Arrays.stream(this.zahlen).sorted().toArray();
        int maxSum = 0;
        for(int i = 0; i < zahlen_sorted.length-1; i++)
            maxSum +=zahlen_sorted[i];
        return maxSum;
    }
}
