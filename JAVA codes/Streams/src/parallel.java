import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int cgpa;
    Student(String name,int cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public int getCgpa() {
        return cgpa;
    }
}
public class parallel {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("A",10));
        al.add(new Student("B",9));
        al.add(new Student("C",8));

        List<Student> als= al.stream().parallel().filter(e->e.getCgpa()>8).collect(Collectors.toList());
        als.forEach(x->System.out.println(x.getName()+" "+x.getCgpa()));

    }
}
