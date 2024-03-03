package java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumberFinderArrays {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input & Variable and Array Declarations
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        int maxNum = Integer.MIN_VALUE, minNum = Integer.MAX_VALUE, mid;

        // Filling the Array with User Input
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = input.nextInt();
        }

        System.out.print("Enter the number you would like to find nearest numbers: ");
        int target = input.nextInt();

        // Sorting the Array & Finding the Wanted Numbers
        Arrays.sort(array);

        // Finding the Wanted Numbers
        int minIndex = Arrays.binarySearch(array, target);
        if (minIndex < 0) {
            minIndex = -(minIndex + 1);
        }
        if (minIndex > 0) {
            minNum = array[minIndex - 1];
        }
        if (minIndex < array.length - 1) {
            maxNum = array[minIndex];
        }

        // Printing the results
        System.out.println(Arrays.toString(array));
        System.out.println("Target: " + target);
        if (minNum == Integer.MAX_VALUE) {
            System.out.println("The closest smaller number is: " + (minNum - 1));
        } else {
            System.out.println("The closest smaller number is: " + minNum);
        }
        if (maxNum == Integer.MIN_VALUE) {
            System.out.println("The closest larger number is: " + (maxNum + 1));
        } else {
            System.out.println("The closest larger number is: " + maxNum);
        }
    }
}