package java101;

import java.util.Scanner;

public class HoroscopeIdentifier {
    public static void main(String[] args) {

        String[] horoscopes = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini",
                "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] startDate = {22, 22, 20, 21, 21, 22, 23, 23, 23, 23, 23, 22};
        int[] endDate = {21, 19, 20, 20, 21, 22, 22, 22, 22, 22, 21, 21};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int day = input.nextInt();

        if ((month >= 1) && (month <= 12) && (day >= 1) && (day <= 31)) {
            int i = 0;
            while (i < months.length && months[i] != month) {
                i++;
            }

            if (i == months.length) {
                System.out.println("You have entered an invalid month!");
            } else if (day <= endDate[i]) {
                System.out.println(horoscopes[i]);
            } else {
                System.out.println(horoscopes[i + 1]);
            }
        } else {
            System.out.println("You have entered an invalid date!");
        }
    }
}