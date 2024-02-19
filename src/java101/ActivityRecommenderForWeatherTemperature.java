package java101;

import java.util.Scanner;

public class ActivityRecommenderForWeatherTemperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature in numbers: ");
        int temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("You can go skiing.");
        } else if (temperature >= 5 && temperature <15) {
            System.out.println("You can go see a movie.");
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("It's picnic time.");
        } else if (temperature >= 25) {
            System.out.println("You can go to swimming.");
        } else {
            System.out.println("You have entered something wrong. Temperature is not correct. Operation cancelled.");
        }

    }

}
