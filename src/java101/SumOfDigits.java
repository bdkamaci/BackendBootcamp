package java101;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Variable Declaration and User Input
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        int tempNum = num;

        // Iteration through each digit
        while (tempNum != 0) {
            // Getting last digit
            int digit = tempNum % 10;
            // Adding digit to the sum
            sum += digit;
            // Removing last digit from the number
            tempNum /= 10;
        }

        System.out.println("The sum of the digits of " + num + " is: " + sum);

    }
}
