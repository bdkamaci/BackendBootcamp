package Java101;

import java.util.Scanner;

public class groceryCashierProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] fruits = {"Pear", "Apple", "Tomato", "Banana", "Eggplant"};
        Double[] prices = {2.14, 3.67, 1.11, 0.95, 5.00};
        int[] kilograms = new int[5];
        double total = 0.0;


        for (int i = 0; i < 5; i++) {
            System.out.print("How many kilograms of " + fruits[i] + " : ");
            kilograms[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
           total += (kilograms[i] * prices[i]);
        }

        System.out.println("Total Amount: " + total + " $");

    }
}
