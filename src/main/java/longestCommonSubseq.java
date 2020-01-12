import static java.lang.Math.max;

public class longestCommonSubseq {

    public static void main(String[] args) {
        char row[] = "acbk".toCharArray();
        char col[] = "gbkc".toCharArray();
        int ab[][] = new int[row.length][col.length];
        int max = 0;
        for (int i = 0; i < row.length; i++) {
            if(row[i]==col[0]){
                ab[i][0]=++max;
            }
        }
        max=0;
        for (int i = 0; i < col.length; i++) {
            if(row[0]==col[i]){
                ab[0][i]=++max;
            }
        }
        for (int i = 1; i < row.length; i++) {
            for (int j = 1; j < col.length; j++) {
                ab[i][j]=max(ab[i][j-1],ab[i-1][j]);
                if(row[i]==col[j])
                    ab[i][j]++;

            }

        }

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                System.out.print(ab[i][j]);
            }
            System.out.println();

        }


    }
}
