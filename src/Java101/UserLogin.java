package Java101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password;

        System.out.print("Enter your username: ");
        userName = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (userName.equals("patikaDev") && password.equals("Java123")) {
            System.out.println("Access granted.");
        } else {
            System.out.print("Wrong credentials! Would you like to reset your password? y/n ");
            String answer = input.nextLine();
            if (answer.equals("y")) {
                System.out.print("Enter your new password: ");
                String newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("The password could not be created, please enter another password.");
                } else {
                    System.out.println("Password created.");
                }
            } else {
                System.out.println("Access denied.");
            }
        }

    }
}
