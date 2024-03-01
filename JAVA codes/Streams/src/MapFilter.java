import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    int empid;
    String empname;
    double sal;
    public Employee(int empid, String empname, double sal) {
        this.empid = empid;
        this.empname = empname;
        this.sal = sal;
    }
}

public class MapFilter {
    public static void main (String[] args) {
        List<Employee> e = new ArrayList<>();
        e.add(new Employee(101,"a",100000));
        Stream<Employee> stm = e.stream();
        List<Employee> als = stm.filter(x->x.sal>1000).collect(Collectors.toList());
        als.forEach(x->System.out.println(x));


    }



}