package Day5.Employee;

public class Product implements Taxable {

    int id;
    double price;
    int quantity;

    Product(int id, double price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        double tax = price * salesTax;
        System.out.println("Sales Tax for product ID " + id + " is: " + tax);
    }
}
