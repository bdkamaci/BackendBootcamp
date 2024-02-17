package Java101;

import java.util.Scanner;

public class circleSectorAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Enter the radius of the circle sector: ");
        int r = input.nextInt();
        System.out.print("Enter the angle of the circle sector: ");
        int alpha = input.nextInt();

        double area = (pi * r * r * alpha) / 360;
        System.out.println("Area of the circle sector: " + area);

    }
}
