import java.util.Scanner;
import java.util.Set;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @author John Domine, U07998397
 * 
 */

public class Driver {
    public static void main(String[] args) throws IOException { //Throws IOException because of the FileOutputStream method
        //Initialize Scanner to take user input
        Scanner scan = new Scanner(System.in);
        //Initialize HashSet to store Employee objects
        Set<Employee> employeeCollection = new HashSet<Employee>();
        
        //Instance variables for employee
        String employeeName;
        float hourlySalary;
        int hoursWorked;
        float weeklyPay;
        
        //Instance variables to initialize for loop
        int numEmployees;
        int employeeCount = 1;
        
        System.out.println("How many employees are there?");
        numEmployees = scan.nextInt();
        
        //Throw custom exception if the user input is less than or equal to 0
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
        
                weeklyPay = (hourlySalary * hoursWorked); //Calculates the weeklyPay
        
                Employee employee = new Employee(employeeName, hourlySalary, hoursWorked, weeklyPay); //Store employee info with corresponding employee count
                employeeCollection.add(employee); //Add current employee to the Employee Set
                employeeCount++; //Increment employee count
                //Go to next employee until loop ends
            }
         }
        
        
       scan.close();
       
       //Shows all of the data that has been collected in the Employee Set in the console
       System.out.println("Employee Information: " + employeeCollection);
      
       //Tests the printSalaryReport method 
       printSalaryReport(employeeCollection);
    }

    //Method to print out all of the created Employee objects and their information in a new text file labeled "employee.csv"
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

        //Iterate through the set using the Iterator import
        Iterator<Employee> it = employeeCollection.iterator();
        while(it.hasNext()) {
            pw.println(); //Print out line to separate 
            pw.println(it.next()); 
        }
        
        pw.close();
    }
}
