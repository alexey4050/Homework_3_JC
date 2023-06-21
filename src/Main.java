import java.util.Arrays;

/** Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты (сделать статическим) в класс руководителя,
 * модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
 * В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.*/
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Andrey", 32, 2000),
                new Manager("Sergey", 40, 5000),
                new Employee("Fedor", 30, 1200),
                new Employee("Peter", 22, 1000),
                new Employee("Sveta", 27, 1500)
        };

        System.out.println("Выводим зарплату сотрудников и руководителя");
        Manager.raiseSalary(employees, 20);

        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }
        System.out.println("Сортируем и повысим зарплату сотрудникам на 10%, но не руководителю" );
        Arrays.sort(employees);
        for(Employee employee : employees){
            System.out.println(employee.getSalary());
        }
        System.out.println("Выведем отсортированный список сотрудников по возрасту");
        Arrays.sort(employees, Employee.sortByAge);
        for(Employee employee : employees) {
            System.out.println(employee.getAge());
        }
    }
}
