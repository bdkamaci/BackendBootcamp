package java101;

import java.util.Scanner;

public class BasicATM {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input and Variable Declarations
        String userName, password;
        int operation, balance = 1500, amount;
        System.out.print("Enter your user name: ");
        userName = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        // Conditional Statement and Switch Case For ATM Operations
        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Welcome to X Bank. Your credentials have been checked.");
            do {
                System.out.print("Which operation would you like to pursue? (1-Deposit, 2-Withdrawal, 3-Balance Inquiry, 4-Exit): ");
                operation = input.nextInt();
                switch (operation) {
                    case 1:
                        System.out.print("Amount: ");
                        amount = input.nextInt();
                        balance += amount;
                        break;
                    case 2:
                        System.out.print("Amount: ");
                        amount = input.nextInt();
                        balance -= amount;
                        break;
                    case 3:
                        System.out.println("Your balance: " + balance);
                        break;
                    case 4:
                        System.out.println("We hope to see you again. Good day!");
                        break;
                    default:
                        System.out.println("Wrong operation number, please try again!");
                }
            } while (operation != 4);
        } else {
            System.out.println("Wrong credentials, please try again!");
        }
    }
}
