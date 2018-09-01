
//Eclipse IDE recommended @SuppressWarnings to ignore the Serial warning 
@SuppressWarnings("serial")
public class InvalidEmployeesException extends Exception {
   public InvalidEmployeesException(String message) {
       super(message);
   }
}
