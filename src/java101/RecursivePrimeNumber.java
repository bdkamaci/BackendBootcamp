package java101;

import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Variable Declarations and User Input
        int number;
        System.out.print("Enter the number you would like to classify: ");
        number = input.nextInt();

        // Printing Classification
        boolean decision = isPrime(number);
        if (decision == true) {
            System.out.println(number + " IS a Prime Number!");
        } else {
            System.out.println(number + " IS NOT a Prime Number!");
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
