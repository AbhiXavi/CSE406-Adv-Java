import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams3 {
    public static void main(String[] args) {
        //to find odd or even
        List<Integer> al = Arrays.asList(1,2,3,4,5);
        List<Integer> all = al.stream().filter(x->x%2!=0).collect(Collectors.toList());
        all.forEach(x->{System.out.println(x);});

        /////////////////////
        String[] name = {"a","b","c","d","e","f"};
        List<String> strlist = Stream.of(name).collect(Collectors.toList());

        String[] name2 = {"a","b","c","d","e","f","g"};
        Stream<String> str1 = Stream.of(name2);
        str1.forEach(e -> {
            System.out.println(e);
        });
        //empty stream
        Stream<Objects> empstream = Stream.empty();
        empstream.forEach(e -> {
            System.out.println(e);
        });

        //
        List<String> alst = Arrays.asList("A","B","Cat","abc");
        Stream<String> stm2 = alst.stream();
        List<String> alst1 = stm2.filter(e->e.startsWith("a")).collect(Collectors.toList());
        System.out.println(alst1);

        //
        IntStream stream1 = Arrays.stream(new int[]{8,4,3,5,6,33,9});
        stream1.forEach(e-> {
            System.out.println(e);
        });

        Stream<String> stream2 = Arrays.stream(new String[]{"a","b","c","d"});
        stream2.forEach(e->{
            System.out.println(e);
        });
    }
}
