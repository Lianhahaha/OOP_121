
package bankaccount;

/**
 *
 * @author CRUZ_CPE121
 */
// BankAccount.java
public class BankAccount {
    String accountNumber;
    double balance;

    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
