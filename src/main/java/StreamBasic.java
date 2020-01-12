import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasic
{
    public static void main(String[] args) {

        List<String> list = Arrays.asList("76","00","45","98","455");
        /*Stream<String> strm =*/
        Optional<Integer> op =
        list
                                .stream()
                                //.filter(s -> s.startsWith("c"))
                                .map(m->
                                        {
                                            return Integer.valueOf(m);

                                        }
                                        )
                .findAny();
                                //.sorted()
                                 //.forEach(i-> System.out.println(i));

        //Integer name = op.get();
        System.out.println(op.isPresent());
        System.out.println(op.get());

        Stream.of("muskan","prashant","brajesh").map(s->s.length())
                .forEach(i-> System.out.println(i));

        IntStream.range(1,101)
                .filter(m->
                {
                    if(m%2==0)
                    return true;
                    else
                        return false;
                }).limit(5)
                .forEach(i-> System.out.println(i));



    }
}
