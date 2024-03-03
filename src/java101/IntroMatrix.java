package java101;

import java.util.Scanner;

public class IntroMatrix {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // Matrix Declaration
        int[][] matrix = new int[3][3];

        // User Input
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        int [][] matrix2 = new int[4][5];
        for(int row = 0; row < matrix2.length; row++) {
            for(int column = 0; column < matrix2[row].length; column++){
                matrix2[row][column] = (int) (Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                System.out.print(matrix2[row][column] + " ");
            }
            System.out.println();
        }

        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
