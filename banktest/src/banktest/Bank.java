
package banktest;


class Bank {
    public void transferMoney(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Transfer completed: " + amount + " moved from Account " + from.getAccountNumber() + " to Account " + to.getAccountNumber());
        } else {
            System.out.println("Transfer unsuccessful: Not enough balance.");
        }
    }
}
