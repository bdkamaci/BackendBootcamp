package Java101;

import java.util.Scanner;

public class TriangleAreaPerimeterCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] sides = new int[3];
        double u = 0, area = 1;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter side " + i + " : ");
            sides[i - 1] = input.nextInt();
        }

        for (int side : sides) {
            u += side;
        }

        u /= 2;
        for (int side : sides) {
            area *= (u - side);
        }

        System.out.println("Perimeter: " + 2 * u);
        System.out.println("Area: " + area);
    }
}