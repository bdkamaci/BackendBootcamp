package java101;

import java.util.Scanner;

public class BasePowerRecursive {

    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input and Variable Declarations
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();

        // Method Calling and Result Printing
        double result = power(base, power);
        System.out.printf("The power of %d to the %d is: %.2f%n", base, power, result);
    }

    // Power Calculation Using Recursive Method
    public static double power(int base, int power) {
        if (power == 0) {
            return 1;
        } else if (power == 1) {
            return base;
        } else {
            return base * power(base, power -1);
        }
    }
}
