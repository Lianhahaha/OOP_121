/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;

/**
 *
 * @author CRUZ_CPE121
 */
// Bank.java
public class Bank {
    // Method to transfer money from one account to another
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        from.withdraw(amount);  // Deduct money from the 'from' account
        to.deposit(amount);     // Add money to the 'to' account
    }
}
