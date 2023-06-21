public class Manager extends Employee{
    public Manager(String name, int age, int salary){
        super(name, age, salary);
    }

    public static  void raiseSalary(Employee[] employees, int percent){
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)){
                employee.setSalary(employee.getSalary() * (100 + percent) / 100);
            }
        }
    }
}
