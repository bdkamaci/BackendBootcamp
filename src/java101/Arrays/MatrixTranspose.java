package java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        // User Input & Variable and Array Declarations
        System.out.print("Enter the number of rows of the array: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns of the array: ");
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];

        // Filling the Array with User Input
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++ ) {
                System.out.print("Enter a number: ");
                array[i][j] = input.nextInt();
            }
        }

        // Printing the Original Matrix
        System.out.println("Original Matrix:");
        for (int[] line : array) {
            System.out.println(Arrays.toString(line));
        }

        // Taking the Transpose
        int[][] transposedMatrix = transpose(array);

        // Printing the Transposed Matrix
        System.out.println("Transposed Matrix:");
        for (int[] line : transposedMatrix) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int [][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++ ) {
                transposedMatrix [j][i] = matrix [i][j];
            }
        }
        return transposedMatrix;
    }
}