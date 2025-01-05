package Day5.Employee;

public class DriverMain {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(1, "Ricky Dawson", 50000);
        emp.calcTax();

        // Create a Product object
        Product prod = new Product(101, 100, 2);
        prod.calcTax();
    }
}
