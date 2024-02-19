package java101;

import java.util.Scanner;

public class EvenAndMultipleOfFourSum {

    public static void main(String[] args) {

        // Scanner declaration
        Scanner input = new Scanner(System.in);

        // Variable Declaration
        int sum = 0;
        int num;

        // Do - While Loop
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        } while (num != 1);

        // Console Logging
        System.out.println("The sum of even numbers and multiples of 4 is: " + sum);
    }
}