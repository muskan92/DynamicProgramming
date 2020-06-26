import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasic
{
    
    
       
    public void getId() {
       List<Customer> customerList = new ArrayList<>();
       customerList.add(new Customer(1,"mn",1));
       customerList.add(new Customer(2,"gf",2));
       customerList.add(new Customer(3,"hgfh",3));
       customerList.add(new Customer(4,"mnb",4));

        List<Integer> collect = customerList.stream().peek(c->System.out.println(c.getId()))
                .map(c -> c.getId())
                .collect(Collectors.toList());


        //Map<String,Customer> nameToCustomerMap =
        Map<String, Integer> collect1 = customerList.parallelStream()
                .map(c -> new Customer(c.getId(),"blue",9))
                .peek(c1 -> System.out.println(c1))
                .collect(Collectors.toMap(k -> Integer.toString(k.getId()), k -> k.getAge()));
        System.out.println(collect1);

    }

    
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
