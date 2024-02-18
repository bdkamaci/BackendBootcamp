package Java101;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] operations = {"1-Addition", "2-Extraction", "3-Multiplication", "4-Division"};
        int[] numbers = new int[2];

        for (int i = 1; i < 3; i++) {
            System.out.print("Enter number " + i + ": ");
            numbers[i-1] = input.nextInt();
        }

        for (String oper : operations) {
            System.out.println(oper);
        }

        System.out.print("Enter which the number for the operation would you like to realize: ");
        int operation = input.nextInt();

        switch(operation) {
            case 1:
                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }
                System.out.println("Sum: " + sum);
                break;
            case 2:
                int diff;
                diff = numbers[0] - numbers[1];
                System.out.println("Difference is: " + diff);
                break;
            case 3:
                int mult = 1;
                for (int num : numbers) {
                    mult *= num;
                }
                System.out.println("Product: " + mult);
                break;
            case 4:
                double div;
                if (numbers[1] != 0) {
                    div = (double) numbers[0] / numbers[1];
                    System.out.println("Quotient: " + div);
                    break;
                } else {
                    System.out.println("You can not divide a number by zero!");
                    break;
                }

            default:
                System.out.println("You have entered the wrong number, operation is cancelled.");
        }

    }
}
