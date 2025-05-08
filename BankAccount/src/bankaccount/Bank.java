
package bankaccount;

/**
 *
 * @author CRUZ_CPE121
 */

public class Bank {
    
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        from.withdraw(amount);  // Deduct money from the 'from' account
        to.deposit(amount);     // Add money to the 'to' account
    }
}
