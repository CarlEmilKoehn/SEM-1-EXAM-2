import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Instatiating list of employeemembers
        ArrayList<Employee> employees = new ArrayList<>();

        //Instantiating new and different instances of employees
        employees.add(new MonthlyEmployee(19000));
        employees.add(new HourlyEmployee(130, 175.15));
        employees.add(new CommissionEmployee(17000, 36550, 0.15));

        //Printing salary for list members
        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary() + " kr");
        }


    }
}
