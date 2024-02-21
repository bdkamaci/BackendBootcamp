package java101;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Variable Declaration and User Input
        System.out.print("Enter number of elements: ");
        int limit = input.nextInt();
        input.close();

        int num1 = 0, num2 = 1, num3;
        System.out.print("Fibonacci Series up to " + limit + ": ");

        while (num1 <= limit) {
            System.out.print(num1 + " ");
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
}
