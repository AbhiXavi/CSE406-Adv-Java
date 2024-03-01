import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(5);
        al.add(10);
        al.add(6);
        System.out.println(al);

        Stream<Integer> stm = al.stream();
        List<Integer> num = stm.map(x->x*x).collect(Collectors.toList());
        System.out.println(num);

        //or

        List<Integer> nums = al.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println(nums);
    }
}
