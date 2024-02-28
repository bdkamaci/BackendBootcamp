package java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HarmonicMeanCalculator {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input & Variable and Array Declarations
        System.out.print("Enter the number of elements you want to include in your calculation: ");
        int n = input.nextInt();
        double[] array = new double[n];
        double sum = 0.0;
        double harmonicMean;

        // Filling out the Array
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));

        // Harmonic Sum Calculation
        for (double elem : array) {
            sum += 1 / elem;
        }

        harmonicMean = n / sum;
        System.out.println("Harmonic Mean: " + harmonicMean);

    }
}