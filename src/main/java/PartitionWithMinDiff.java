public class PartitionWithMinDiff {

    public static void main(String[] args) {
        int ar [] = {1,6,11,5};
        int Total = 23;//sum of ar

        int min = calcMin(ar,ar.length,0,Total);
        System.out.println(min);
    }

    private static int calcMin(int[] ar, int len, int calculatedTill, int total) {
        int include=0;int exclude=0;
        if(len==0)
            return Math.abs(calculatedTill-(total-calculatedTill));
         include = calcMin(ar,len-1,calculatedTill+ar[len-1],total);
         exclude = calcMin(ar,len-1,calculatedTill,total);
        return Math.min(include,exclude);

    }

}
