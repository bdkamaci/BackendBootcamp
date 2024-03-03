package java101.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SerieSorter {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input and Variable Declarations
        System.out.print("Enter the size of array n: ");
        int size = input.nextInt();
        int[] serie = new int[size];

        // Filling the Array
        for (int i = 0; i < size; i++) {
            System.out.print((i+1) + ". Element: ");
            serie[i] = input.nextInt();
        }

        // Sorting Array
        Arrays.sort(serie);

        // Printing the elements
        System.out.print("Sorted array: ");
        for (int value : serie) {
            System.out.print(value + " ");
        }


    }
}
