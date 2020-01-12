public class knapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int wt[] = {10,20,30};
        int w=50;
        int value = calMaxVal(w,val,wt,val.length);
        System.out.println(value);
    }
    static int calMaxVal(int w, int val[], int wt[],int index){
        if(w==0|| index <=0)
            return 0;


        int include = calMaxVal(w-wt[index-1],val,wt,index-1)+val[index-1];
        int exclude = calMaxVal(w,val,wt,index-1);
        int max = Math.max(include,exclude);
        return max;
    }
}
