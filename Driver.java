import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Employee> employeeCollection = new HashSet<Employee>();
        
        String employeeName;
        float hourlySalary;
        int hoursWorked;
        float weeklyPay;
        
        int numEmployees;
        int employeeCount = 1;
        
        System.out.println("How many employees are there?");
        numEmployees= scan.nextInt();
        
        for (int i = 0; i < numEmployees; i++) {
          
        System.out.println("What is Employee " + employeeCount + "'s name?");
        scan.nextLine();  //Allows to go to next line, preventing overlap
        
        employeeName = scan.nextLine(); //Take in user input for name
        
        System.out.println("What is Employee " + employeeCount + "'s hourly salary?");
        hourlySalary = scan.nextFloat(); //Take in user input for hourly salary
        
        System.out.println("How many hours has Employee " + employeeCount + " worked?");
        hoursWorked = scan.nextInt(); //Take in user input for hours worked
        
        weeklyPay = (hourlySalary * hoursWorked);
        
        Employee employee = new Employee(employeeName, hourlySalary, hoursWorked, weeklyPay); //Store employee info with corresponding employee count
        employeeCollection.add(employee);
        employeeCount++; //Increment employee count
        //Go to next employee
        }
        
       scan.close();
       System.out.println(employeeCollection);

    }
}
