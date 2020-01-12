import java.util.Arrays;
import java.util.List;

public class WordBreakPrblm {

    public static void main(String[] args) {

        String main = "IAMKHAN";
        List<String> dict = Arrays.asList("I","N","AM","KH","KHAN","N","M","AN","A");

        wordBreak(dict,main,"");

    }

    private static void wordBreak(List<String> dict, String str, String out) {

        if(str.length()==0)
            System.out.println(out);
        for(int i=1; i<=str.length();i++){
            String prefix = str.substring(0,i);

            if(dict.contains(prefix))
                wordBreak(dict,str.substring(i),out+" "+prefix);
        }
    }
}
