package java101;

import java.util.Scanner;

public class LeapYearIdentifier {
    public static void main(String[] args) {

        // Scanner declaration
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter the year you would like to identify as leap or not: ");
        int year = input.nextInt();

        // Identification
        int seperator = year % 4;

        if (seperator == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
