package Day4;

//Main class to test the program
public class Main2 {
 public static void main(String[] args) {
     // Create an instance of Employee
     Employee emp = new Employee("John", 30, 123456, 50000.00);

     // Display employee information
System.out.println("Employee Name: " + emp.name);
     System.out.println("Employee Age: " + emp.age);
     System.out.println("Employee ID: " + emp.employeeID);
     System.out.println("Employee Salary: $" + emp.salary);
 }
}
