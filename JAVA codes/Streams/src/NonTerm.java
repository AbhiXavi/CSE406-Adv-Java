import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonTerm {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> stm = al.stream().min(Integer::compare);
        if(stm.isPresent()) {
            System.out.println(stm.get());
        }

        Optional<Integer> m1 = al.stream().max((x,y)->{return x.compareTo(y);});
        System.out.println(m1.get());

        List<String> al1 = Arrays.asList("a","c","b","1","2");


    }
}
