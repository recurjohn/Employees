import java.util.Scanner;
import java.util.Set;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

public class Driver {
    public static void main(String[] args) throws IOException {
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
        
        if (numEmployees <= 0) 
        {
            try 
            {
                //Throw object of Exception class
                throw new InvalidEmployeesException("The input should be greater than 0.");
            }
            catch (InvalidEmployeesException exception)
            {
                //Print out that the exception has been caught and its details
                System.out.println("Exception has been caught.");
            
                System.out.println(exception.getMessage());
            }
        }
         
        else 
        {
            //Loop through the amount of employees that has been received for input
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
                employeeCollection.add(employee); //Add current employee to the Employee Set
                employeeCount++; //Increment employee count
                //Go to next employee
            }
         }
        
        
       scan.close();
       
       //Shows what employees have been collected in the Employee Set
       System.out.println(employeeCollection);
       
       //Tests the printSalaryReport method 
       printSalaryReport(employeeCollection);
    }

    public static void printSalaryReport(Set<Employee> employeeCollection) throws IOException
    {
        //Create file to be exported
        FileOutputStream fos = new FileOutputStream("employee.csv");
        //Allow file to be written to 
        PrintWriter pw = new PrintWriter(fos);
        
        //Headers separated by commas 
        pw.print("Name");
        pw.print(',');
        pw.print("Hourly Salary");
        pw.print(',');
        pw.print("Hours Worked");
        pw.print(',');
        pw.print("Weekly Pay");

        //Iterate through the set
        //TODO: Find out how to add the data inside the employee
        Iterator<Employee> it = employeeCollection.iterator();
        while(it.hasNext()) {
            pw.println("");
            pw.println(it.next());            
        }
        
        pw.close();
    }
}
