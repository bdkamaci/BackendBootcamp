package Java101;

import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        int weight = input.nextInt();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

    }
}
