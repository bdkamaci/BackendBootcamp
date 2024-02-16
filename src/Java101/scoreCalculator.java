package Java101;

import java.util.Scanner;

public class scoreCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] subjects = {"Math", "Physics", "Chemistry", "Turkish", "History", "Music"};
        int[] scores = new int[6];

        for (int i = 0; i < 6; i++){
            System.out.print("Enter your " + subjects[i] + " score: ");
            scores[i] = input.nextInt();
        }

        double total = 0;
        for (int score : scores) {
            total += score;
        }

        double gpa = (total / subjects.length);
        System.out.println("GPA: " + gpa);

        final String passage = gpa >= 60
                ? "You have passed!"
                : "You have failed!";

        System.out.println(passage);
        }
    }