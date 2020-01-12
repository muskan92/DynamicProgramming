import java.util.Arrays;

public class LongestIncrSubSeq {

    public static void main(String[] args) {

        int a[] = {3,5,4,3,2,1};
        int[] b = new int[a.length];

        System.out.printf(Arrays.toString(a));
        for (int k = 0; k <a.length ; k++) {
            b[k]=1;
        }
        System.out.println(Arrays.toString(b));
        for (int m = 1; m <a.length ; m++) {
            for (int c = 0; c < m; c++) {
                if(a[c]<a[m] && b[m]<b[c]+1)
                    b[m]= b[c]+1;
            }
        }
        System.out.printf(Arrays.toString(b));

    }
}
