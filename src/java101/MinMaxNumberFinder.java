package java101;

import java.util.Scanner;

public class MinMaxNumberFinder {
    public static void main(String[] args) {

        // Scanner and Variable Declaration
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of total numbers you are going to enter: ");
        int limit = input.nextInt();
        int[] numbers = new int[limit];
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        // Appending numbers Array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();

            // Update min and max values
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }

        System.out.println("Min Number: " + minNum);
        System.out.println("Max Number: " + maxNum);

    }
}
