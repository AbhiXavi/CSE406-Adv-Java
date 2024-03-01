import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Mobile {
    String name;
    int price;
    String processsor;
    int ram;

    public Mobile(String name, int price, String processsor, int ram) {
        this.name = name;
        this.price = price;
        this.processsor = processsor;
        this.ram = ram;

    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getProcesssor() {
        return processsor;
    }
    public int getRam() {
        return ram;
    }
    @Override
    public String toString() {
        return "Mobile:" + name + " price:" + price + " " + processsor + " "  + ram;
    }
}
public class ToArrayy {
    public static void main(String[] args) {
        List<Mobile> l = new ArrayList<>();
        l.add(new Mobile("A",2000,"A1",8));
        l.add(new Mobile("B",1000,"B1",4));
        l.add(new Mobile("C",7000,"C1",6));
        l.add(new Mobile("D",8000,"D1",12));
        l.add(new Mobile("E",10000,"E1",16));

        Stream<Mobile> stm = l.stream().sorted(Comparator.comparingInt(Mobile::getPrice));
        Object[] arr = stm.toArray();
        System.out.println(arr);
        for(Object arr1 : arr) {
            System.out.println(arr1);
        }


    }
}
