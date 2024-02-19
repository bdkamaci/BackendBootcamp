package java101;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount without tax: ");
        double initial = input.nextDouble();

        double amount = 0, taxPercentage = 0, taxAmount = 0;

        if (initial > 1000){
            taxPercentage += 0.08;
        } else if ((initial > 0) && (initial <= 1000)) {
            taxPercentage += 0.18;
        }

        taxAmount += (initial * taxPercentage);
        amount += (initial + taxAmount);

        System.out.println("Amount without Tax " + initial);
        System.out.println("Tax Percentage: " + taxPercentage);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Amount with Tax: " + amount);
    }
}
