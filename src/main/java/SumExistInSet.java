public class SumExistInSet {
    public static void main(String[] args) {
        int ar[] = {3,6,2,5};
        int sum = 4;

        boolean exist = isExist(sum,ar,ar.length);
        System.out.println(exist);
    }
    static boolean isExist(int sum, int ar[], int index){

        if(index<=0)
            return false;
        if(sum==0)
            return true;
        boolean include = isExist(sum-ar[index-1],ar,index-1);
        boolean exclude = isExist(sum, ar, index-1);
        return include || exclude;
    }
}
