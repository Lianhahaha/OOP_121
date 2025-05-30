
package banktest;


class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account: " + accountNumber + " | Current Balance: " + balance);
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully added " + amount + " to Account " + accountNumber);
        } else {
            System.out.println("Deposit failed: Invalid amount.");
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + " from Account " + accountNumber);
            return true;
        } else {
            System.out.println("Withdrawal failed: Insufficient balance or invalid amount.");
            return false;
        }
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}