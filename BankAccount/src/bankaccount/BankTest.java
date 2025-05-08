
package bankaccount;

/**
 *
 * @author CRUZ_CPE121
 */
import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Account 1 Number: ");
        String account1Number = scanner.nextLine();
        System.out.print("Enter initial balance for Account 1: ");
        double account1Balance = scanner.nextDouble();

        
        scanner.nextLine();  

        
        System.out.print("Enter Account 2 Number: ");
        String account2Number = scanner.nextLine();
        System.out.print("Enter initial balance for Account 2: ");
        double account2Balance = scanner.nextDouble();

       
        BankAccount account1 = new BankAccount(account1Number, account1Balance);
        BankAccount account2 = new BankAccount(account2Number, account2Balance);

      
        System.out.println("\nBefore Transfer:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

       
        System.out.print("\nEnter amount to transfer from Account 1 to Account 2: ");
        double transferAmount = scanner.nextDouble();

     
        Bank bank = new Bank();

       
        bank.transferMoney(account1, account2, transferAmount);

        
        System.out.println("\nAfter Transfer:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        // Close the scanner
        scanner.close();
    }
}
