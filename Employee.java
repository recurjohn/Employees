import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Employee {
    //Instance variables
    private String employeeName;
    private float hourlySalary;
    private int hoursWorked;
    private float weeklyPay;
    
  //Create an Employee object
    public Employee(String employeeName, float hourlySalary, int hoursWorked, float weeklyPay) 
    {
        this.employeeName = employeeName;
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
        this.weeklyPay = weeklyPay;
    }
        
    //Getter methods
    public String getEmployeeName()
    {
        return employeeName;
    }
    
    public float getHourlySalary()
    {
        return hourlySalary;
    }
    
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    
    public float getWeeklyPay()
    {
        return weeklyPay;
    }
    
    //Setter methods 
    public void setName(String employeeName)
    {
        this.employeeName = employeeName;
    }
    
    public void setHourlySalary(float hourlySalary)
    {
        this.hourlySalary = hourlySalary;
    }
    
    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
    public void setWeeklyPay(float weeklyPay)
    {
        this.weeklyPay = weeklyPay;
    }
    
    //@Override
    @Override
    public String toString() {
        return employeeName;
    }
        
    
    public static void printSalaryReport(Set<Employee> employeeCollection) throws IOException
    {
        FileWriter writer = new FileWriter("employee.csv");
                
        writer.append("Name");
        writer.append(',');
        writer.append("HourlySalary");
        writer.append(',');
        writer.append("Hours Worked");
        writer.append(',');
        writer.append("Weekly Pay");
        writer.append('\n');
            
        /*for (int i = 0; i < employeeCollection.size(); i++) {
            
        }*/
        writer.close();
    }
    
}
