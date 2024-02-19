package java101;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
        }

        int calculation;
        calculation = numbers[0] + numbers[1] * numbers[2] - numbers[1];

        System.out.println(calculation);

    }
}
