package java101;

import java.util.Scanner;

public class EvenNumberIdentifier {
    public static void main(String[] args) {

        // Scanner declaration
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            } else {
                continue;
            }
        }
    }
}
