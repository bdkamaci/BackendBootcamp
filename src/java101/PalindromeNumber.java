package java101;

import java.util.Scanner;

public class PalindromeNumber {

    // Recursive Method Declaration
    static boolean isPalindrome (int number) {
        int temporary = number, reverseNumber = 0, lastDigit;
        while (temporary != 0) {
            System.out.println("Number: " + temporary);
            lastDigit = temporary % 10;
            System.out.println("Last Digit: " + lastDigit);
            reverseNumber = (reverseNumber * 10) + lastDigit;
            System.out.println("New number: " + reverseNumber);
            System.out.println("===================");
            temporary /= 10;
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you would like to identify as Palindrome or not: ");
        int num = input.nextInt();

        isPalindrome(num);

    }
}
