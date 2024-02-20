package java101;

import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Variable Declaration and User Input
        int distance, age, tripType, ticketCount;
        double ageDiscount, roundTripDiscount, distancePrice = 0.1;
        double ticketPrice;

        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter the distance in km: ");
        distance = input.nextInt();
        System.out.print("Choose your trip type (1-Round Trip, 2-Single Way): ");
        tripType = input.nextInt();

        // Valid Input Check
        if ((distance > 0) && (age > 0) && ((tripType == 1) || (tripType == 2))) {
            // Discount Identification Using Conditional Statements
            if (age < 12) {
                ageDiscount = 0.5;
            } else if ((age >= 12) && (age <= 24)) {
                ageDiscount = 0.1;
            } else if (age > 65) {
                ageDiscount = 03;
            } else {
                ageDiscount = 0.0;
            }
            if (tripType == 1) {
                roundTripDiscount = 0.2;
                ticketCount = 2;
            } else {
                roundTripDiscount = 0.0;
                ticketCount = 1;
            }

            // Ticket Price Calculation
            ticketPrice = (distance * distancePrice * (1 - ageDiscount) * (1 - roundTripDiscount) * ticketCount);
            System.out.println("Total: " + (int)ticketPrice + " $");

        } else {
            System.out.println("You have entered incorrect information. Please try again!");
        }



    }
}
