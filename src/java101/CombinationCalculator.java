package java101;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Variable Declaration and User Input
        System.out.print("Enter the first number: ");
        int n = input.nextInt();
        System.out.print("Enter the second number: ");
        int r = input.nextInt();

        // Checking if r is greater than n
        if (r > n) {
            System.out.println("C(" + n + "," + r + ") : 0");
            return;
        }

        // Factorial Calculation
        long factorialN = 1;
        long factorialR = 1;
        long factorialDiff = 1;
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
            if (i <= r) {
                factorialR *= i;
            }
            if (i <= n - r) {
                factorialDiff *= i;
            }
        }

        // Combination Calculation (Formula : C(n,r) = n! / (r! * (n-r)!))
        long combination;
        combination = factorialN / (factorialR * factorialDiff);
        System.out.println("C(" + n + "," + r + ") : " + combination);

    }
}