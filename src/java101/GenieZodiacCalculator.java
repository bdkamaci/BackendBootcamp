package java101;

import java.util.Scanner;

public class GenieZodiacCalculator {
    public static void main(String[] args) {

        // Genie Zodiac Array
        String[] genieZodiacs = {"Monkey", "Cockerel", "Dog", "Pig", "Mouse", "Ox",
                "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

        // Scanner declaration
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        // Calculation Using Java Switch Case
        int seperator = birthYear % 12;

        switch(seperator) {
            case 0:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[0]);
                break;
            case 1:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[1]);
                break;
            case 2:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[2]);
                break;
            case 3:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[3]);
                break;
            case 4:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[4]);
                break;
            case 5:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[5]);
                break;
            case 6:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[6]);
                break;
            case 7:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[7]);
                break;
            case 8:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[8]);
                break;
            case 9:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[9]);
                break;
            case 10:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[10]);
                break;
            case 11:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[11]);
                break;
            case 12:
                System.out.println("Your Genie Zodiac Sign: " + genieZodiacs[12]);
                break;
        }
    }
}
