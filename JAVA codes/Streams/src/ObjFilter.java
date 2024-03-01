import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int price;
    String name;
    int model;

    Product(int price,String name, int model) {
        this.price = price;
        this.name = name;
        this.model = model;
    }
}
public class ObjFilter {
    public static void main(String[] args) {
        List<Product> al = new ArrayList<>();
        al.add(new Product(100,"a",1));
        al.add(new Product(200,"b",2));
        al.add(new Product(300,"c",3));

        List<Integer> als = al.stream().filter(e->e.price>=100)
                .map(e->e.price+5).collect(Collectors.toList());
        System.out.println(als);
    }
}
