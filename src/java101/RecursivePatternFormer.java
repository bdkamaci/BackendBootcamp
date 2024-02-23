package java101;

import java.util.Scanner;

public class RecursivePatternFormer {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input and Variable Declaration
        System.out.print("Enter N: ");
        int number = input.nextInt();
        pattern(number);

    }

    // Recursive Method to Form the Given Pattern
    public static void pattern(int number) {
        int temporary = number;
        if (number >= 0 && number <= temporary) {
            System.out.print(number + " ");
            if (number == 0) {
                return;
            }
            pattern(number - 5);
            System.out.print(number + " ");
        }
    }
}
