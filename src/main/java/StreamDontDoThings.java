import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDontDoThings {

    public static void main(String[] args) {

 /*       intstream st = intstream.of(1,2);
        st.foreach(system.out::println);

        //this will give java.lang.illegalstateexception:
        //  stream has already been operated upon or closed
        //st.foreach(i->system.out.println(i));


        intunaryoperator test = new intunaryoperator() {
            @override
            public int applyasint(int i) {
                return i+1;
            }
        };

        intstream.iterate(0,new intunaryoperator() {
            @override
            public int applyasint(int i) {
                return i+1;
            }
        }).limit(10).peek(i->system.out.println(i)).filter(i->i%2==0).foreach(system.out::println);
*/

 /*       IntStream.iterate(0,i->(i+1)%2)
                .distinct()
                .limit(10)
                .forEach(System.out::println);
*/

        List<Integer> list =  Stream.of(2,3,4).collect(Collectors.toList());

        Stream<Integer> language = Stream.of(2,3,4);

        //Convert a Stream to List
        List<Integer> result = language.collect(Collectors.toList());

    }
}
