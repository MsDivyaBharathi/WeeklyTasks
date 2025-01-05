package Day4;

//Create a subclass Employee that inherits from Person
class Employee extends Person1 {
 int employeeID;
 double salary;

 // Constructor for Employee class
 public Employee(String name, int age, int employeeID, double salary) {
     // Initialize Person attributes using super keyword
     super(name, age);
     this.employeeID = employeeID;
     this.salary = salary;
 }
}
