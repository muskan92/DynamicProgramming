public class StringInputOutput {

    public static void main(String[] args) {

        char col[] ="cut".toCharArray();
        char row[] ="cat".toCharArray();
        int ab[][] = new int[row.length][col.length];
        int max=0;
        for (int i = 0; i < col.length; i++) {
            if(col[i]==row[0]){
                ab[0][i]=max;
            }else{
                ab[0][i]= ++max;
            }
        }
        max=0;
        for (int i = 0; i < row.length; i++) {
            if(col[0]==row[i]){
                ab[i][0]=max;
            }else{
                ab[i][0]= ++max;
            }
        }
        for (int i = 1; i < row.length; i++) {
            for (int j = 1; j <col.length ; j++) {

                if(row[i]==col[j]){
                   int x =Math.min(ab[i-1][j],ab[i][j-1]);
                    ab[i][j] = Math.min(x,ab[i-1][j-1]);

                }else{
                    int x =Math.min(ab[i-1][j],ab[i][j-1]);
                    ab[i][j] = Math.min(x,ab[i-1][j-1])+1;                }

            }

        }
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j <col.length ; j++) {
                System.out.print(ab[i][j]+",");

            }
            System.out.println("");
        }

    }
}







