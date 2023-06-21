import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.salary, employee.salary);
    }

    public static Comparator<Employee> sortByAge = new Comparator<Employee>(){
        @Override
        public int compare(Employee e1, Employee e2){
            return Integer.compare(e1.age, e2.age);
        }
    };
}

