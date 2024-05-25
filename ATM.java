import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        int accountBalance = 10000;
        int pin = 1234;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to ATM!");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (!verifyPIN(pin, scanner)) {
                System.out.println("Invalid PIN. Please try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    withdraw(accountBalance, scanner);
                    break;
                case 2:
                    deposit(accountBalance, scanner);
                    break;
                case 3:
                    checkBalance(accountBalance);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static boolean verifyPIN(int correctPIN, Scanner scanner) {
        System.out.print("Enter your PIN: ");
        int enteredPIN = scanner.nextInt();
        return enteredPIN == correctPIN;
    }

    private static void withdraw(int balance, Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Please collect your cash.");
            System.out.println("Remaining balance: " + balance);
        }
    }

    private static void deposit(int balance, Scanner scanner) {
        System.out.print("Enter deposit amount: ");
        int depositAmount = scanner.nextInt();

        balance += depositAmount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    private static void checkBalance(int balance) {
        System.out.println("Your current balance is: " + balance);
    }
}
