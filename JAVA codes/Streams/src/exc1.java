import java.util.*;
import java.util.stream.Stream;

class Employee1 {
    private int empId;
    private String name;
    private int salary;
    private String country;

    Employee1(int empId,String name,int salary,String country) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.country=country;
    }

    // Getters and setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
public class exc1 {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1(101, "John Doe", 50000, "USA"));
        employees.add(new Employee1(102, "Jane Smith", 45000, "INDIA"));
        employees.add(new Employee1(103, "Mike Smith", 60000, "INDIA"));
        employees.add(new Employee1(104, "Alice Walker", 40000, "UK"));

        Stream<Employee1> als = employees.stream().filter(e->e.getCountry().equals("INDIA")).sorted(Comparator.comparingInt(Employee1::getEmpId));
        als.forEach(x->System.out.println(x.getName() + " "+x.getSalary()));
    }
}
