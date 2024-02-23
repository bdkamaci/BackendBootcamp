package java101;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Variable Declarations and User Input
        int start, finish;
        System.out.print("Enter initial number: ");
        start = input.nextInt();
        System.out.print("Enter last number: ");
        finish = input.nextInt();

        // Printing Prime Numbers
        System.out.println("Prime numbers between " + start + " - " + finish + ": ");
        for (int i = start; i <= finish; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Identification if Prime Number or not
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
