package java101;

import java.util.Scanner;

public class HarmonicSerieFinder {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input and Variable Declarations
        System.out.print("Enter the number you would like to find the harmonic series: ");
        int num = input.nextInt();
        double sum = 0.0;

        // For loop for Calculation
        for (int i = 1; i <= num; i++) {
            sum += (1.0 / i);
        }

        System.out.println("Sum: " + sum);
    }
}
