/**
 * 
 * @author John Domine, U07998397
 * 
 */
 
public class Employee {
    //Instance variables
    private String employeeName;
    private float hourlySalary;
    private int hoursWorked;
    private float weeklyPay;
    
    //Default constructor
    public Employee()
    {
        this.employeeName = "Bob";
        this.hourlySalary = 0.0f;
        this.hoursWorked = 0;
        this.weeklyPay = 0.0f;
    }
        
    //Parameterized constructor
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
    
    //@Override method
    @Override
    public String toString() {
        //Return the employee object's information! 
        //Side Note: Was stuck for the longest time because I was only returning employeeName and none of the other variables 
        return employeeName + ',' + hourlySalary + ',' + hoursWorked + ',' + weeklyPay;
    }
        
    
    
}
