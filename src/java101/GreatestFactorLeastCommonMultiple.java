package java101;

import java.util.Scanner;

public class GreatestFactorLeastCommonMultiple {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner scanner = new Scanner(System.in);

        // Variable Declaration and User Input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    // GDC Calculation
    private static int findGCD(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM Calculation
    private static int findLCM(int a, int b) {
        int lcm = a;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
    }
}

