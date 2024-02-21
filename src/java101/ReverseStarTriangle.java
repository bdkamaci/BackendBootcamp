package java101;

import java.util.Scanner;

public class ReverseStarTriangle {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input and Variable Declaration
        System.out.print("Enter the number of levels: ");
        int level = input.nextInt();

        // For Loop for Triangle Construction
        for (int i = level; i >= 1; i--){
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
