import java.util.Scanner;
public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create one BankAccount object - starting balance $500
        BankAccount account = new BankAccount("ACC1001", 500.00);

        boolean running = true;

        System.out.println("=== Welcome to the DecodeLabs ATM ===");

        while (running) {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Validate menu choice is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number (1-4).");
                sc.next();
                System.out.print("Choose an option: ");
            }
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: $%.2f%n", account.checkBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = getValidAmount(sc);
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = getValidAmount(sc);
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for using DecodeLabs ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        }

        sc.close();
    }

    // Helper method - validates amount input is a proper number before use
    private static double getValidAmount(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid amount.");
            sc.next(); // clear bad token
            System.out.print("Enter amount: ");
        }
        return sc.nextDouble();
    }
}