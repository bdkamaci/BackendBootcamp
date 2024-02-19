package java101;

import java.util.Scanner;

public class PowerFinder {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter a number: ");
        int power = input.nextInt();
        System.out.println();

        // For Loop
        for (int i = 1; i <= power; i++) {
            int fourPower = (int) Math.pow(4, i);
            int fivePower = (int) Math.pow(5, i);

            System.out.println("4ˆ" + i + " = " + fourPower);
            System.out.println("5ˆ" + i + " = " + fivePower);
            System.out.println();
        }

    }
}
