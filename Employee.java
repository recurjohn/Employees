
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
        
    
    
}
