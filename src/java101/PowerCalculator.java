package java101;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter the number you want to get the power of: ");
        int num = input.nextInt();
        System.out.print("Enter the number of power you want to get: ");
        int power = input.nextInt();

        // For Loop
        for (int i = 1; i <= power; i++) {
            int numPower = (int) Math.pow(num, i);
            System.out.println(num + "ˆ" + i + " = " + numPower);
        }

    }
}

