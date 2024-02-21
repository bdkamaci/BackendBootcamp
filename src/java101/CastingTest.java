package java101;

import java.util.Scanner;

public class CastingTest {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        System.out.print("Enter a decimal number: ");
        double decimalNum = input.nextDouble();

        // Casting Operations and Console Printing
        int newInteger = (int) decimalNum;
        double newDouble = (double) integer;

        System.out.println("Old integer: " + integer + "New double: " + newDouble);
        System.out.println("Old double: " + decimalNum + "New integer: " + newInteger);

    }
}
