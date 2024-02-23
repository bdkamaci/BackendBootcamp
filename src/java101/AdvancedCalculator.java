package java101;

import java.sql.ResultSet;
import java.util.Scanner;

public class AdvancedCalculator {

    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are you going to enter: ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result: " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number: ");
            number = input.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers are you going to enter: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number:");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter 0 for divider!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter power: ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }

    static void mode() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[2];
        int mode;
        for (int i = 0; i <= 1; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
        }
        mode = numbers[0] % numbers[1];
        System.out.println(numbers[0] + " mode " + numbers[1] + ": " + mode);
    }

    static void recAreaPerimeter() {
        Scanner input = new Scanner(System.in);
        int perimeter = 0, area = 1, side;
        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter the side lengths of the rectangle: ");
            side = input.nextInt();
            area *= side;
            perimeter += side;
        }
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + 2 * perimeter);
    }

    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Variable Declarations and User Input
        int selection;
        String menu = """
                1-Addition
                2-Substraction
                3-Multiplication
                4-Division
                5-Number to the Power of N
                6-Factorial
                7-Mode Calculation
                8-Rectangle Area and Perimeter Calculation
                0-Exit""";

        // Do - While and Switch Case Block For Operation Identification
        do {
            System.out.println(menu);
            System.out.print("Choose an operation: ");
            selection = input.nextInt();
            switch (selection) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    recAreaPerimeter();
                    break;
                case 0:
                    System.out.println("logging out!");
                    break;
                default:
                    System.out.println("You have entered an invalid number for operation. Please try again!");
            }

        } while (selection != 0);


    }
}
