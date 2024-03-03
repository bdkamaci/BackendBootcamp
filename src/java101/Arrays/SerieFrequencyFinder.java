package java101.Arrays;

import java.util.Arrays;

public class SerieFrequencyFinder {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        // Sorting the Array
        Arrays.sort(arr);

        // Variable Declarations
        int num = arr[0];
        int count = 1;

        // Checking each element and Finding frequencies
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            } else {
                System.out.println("Number " + num + " repeated for " + count + " time(s).");
                num = arr[i];
                count = 1;
            }
        }

        // Printing
        System.out.println("Number " + num + " repeated for " + count + " time(s).");

    }
}
