package java101.Arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args) {

        // Scanner and Variable Declarations
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0, selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Please enter your guess: ");
            selected = input.nextInt();

            // Comparing the classified number and entered input
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 1-100!");
                if (isWrong) {
                    right++;
                    System.out.println("You have entered too many wrong numbers. Remaining credit(s): " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("If you enter incorrectly again, your credit will be deducted.");
                }
                continue;
            }

            // Guess Comparison
            if (selected == number) {
                System.out.println("Congratulations, correct guess! The number you guessed: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You have entered incorrect number.");
                if (selected > number) {
                    System.out.println(selected + " is greater than the classified number.");
                } else {
                    System.out.println(selected + " is smaller than the classified number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining credit(s): " + (5 - right));
            }

        }

        // Printing if you have won or not
        if (!isWin) {
            System.out.println("You have lost the game!");
            if (!isWrong) {
                System.out.println("Your guesses: " + Arrays.toString(wrong));
            }
        }

    }
}
