package Java101;

import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] subjects = {"Math", "Physics", "Chemistry", "Turkish", "History", "Music"};
        int[] scores = new int[6];

        for (int i = 0; i < 6; i++){
            System.out.print("Enter your " + subjects[i] + " score: ");
            int scoreInput = input.nextInt();
            if ((scoreInput > 0) && (scoreInput < 100)) {
                scores[i] = scoreInput;
            }
        }

        for (int scor : scores) {
            System.out.println(scor);
        }

        double total = 0;
        for (int score : scores) {
            total += score;
        }

        int divident = 0;
        for (int grade : scores){
            if (grade != 0) {
                divident ++;}
        }

        double gpa = (total / divident);
        System.out.println("GPA: " + gpa);

        final String passage = gpa >= 60
                ? "You have passed!"
                : "You have failed!";

        System.out.println(passage);
        }
    }