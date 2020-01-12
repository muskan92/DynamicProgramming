public class MinCoinMaxVal {
    public static void main(String[] args) {
        Integer ar[]={3,5,7,4};
        Integer req = 30;
        Integer count = calcCount(ar,ar.length,req);
        System.out.println(count);
        System.out.println(Integer.MAX_VALUE);
    }

    private static int calcCount(Integer[] ar, Integer length, Integer req) {

        if(length==0)
            return 1;
        if(req==0)
            return 1;
        if(req<0)
            return Integer.MAX_VALUE-100;
        Integer include = calcCount(ar,length,req-ar[length-1])+1;
        Integer exclude = calcCount(ar, length-1, req);

        return Math.min(include,exclude);
    }
}
