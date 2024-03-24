package java102.Practice;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {

        // Scanner Declaration
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Try-Catch Block to Handle ArrayIndexOutOfBoundsException
        try {
            System.out.print("Please enter the index of the element you would like to access: ");
            int index = scanner.nextInt();
            System.out.println(getElement(numbers, index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    public static int getElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("The specified index is outside the array size!");
        }
        return array[index];
    }
}

