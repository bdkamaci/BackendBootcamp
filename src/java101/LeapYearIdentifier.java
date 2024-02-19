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
        int divideByFour = year % 4;
        int divideByHundred = year % 10;
        int dividedByFourHundred = year % 400;

        if ((divideByFour == 0 && divideByHundred !=0) || dividedByFourHundred == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
