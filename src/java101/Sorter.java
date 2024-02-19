package java101;

import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    }
            }
        }

        for (int elem : numbers) {
            System.out.println(elem);
        }
    }
}
