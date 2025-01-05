package Day4;

//Main class to test the program
public class Main3 {
 public static void main(String[] args) {
     // Create an instance of Account
     Account acc1 = new Account();
     Account acc2 = new Account(100.0);

     // Deposit some amount
     acc1.deposit(500.0);
     acc2.deposit(200.0);

     // Withdraw some amount
     acc1.withdraw(200.0);
     acc2.withdraw(150.0);

     // Display balances
     acc1.displayBalance();
     acc2.displayBalance();
 }
}
