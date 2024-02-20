package java101;

import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input and Variable Declarations
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Diamond Shape Construction

        // Outer loop to handle the number of lines
        for (int i = 0; i <= num; i++) {
            // Inner loop to handle the number of spaces
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            // Inner loop to handle the number of asterisks
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Outer loop to handle the number of lines
        for (int i = num - 1; i >= 0; i--) {
            // Inner loop to handle the number of spaces
            for (int j = 0 ; j < (num - i); j++) {
                System.out.print(" ");
            }
            // Inner loop to handle the number of asterisks
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
