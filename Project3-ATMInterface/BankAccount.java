
public class BankAccount {

    // Private fields - the "vault" - no outside code can touch these directly
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter - read-only access to balance
    public double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Deposit - a security checkpoint, validates before mutating state
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return false;
        }
        balance += amount;
        System.out.printf("Deposited: $%.2f%n", amount);
        return true;
    }

    // Withdraw - enforces overdraft rule before mutating state
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: $" + String.format("%.2f", balance));
            return false;
        }
        balance -= amount;
        System.out.printf("Withdrew: $%.2f%n", amount);
        return true;
    }
}
