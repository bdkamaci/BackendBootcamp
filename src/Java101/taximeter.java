package Java101;

import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");

        int distance = input.nextInt();
        int opening = 10, minCost = 20;
        double costPerKm = 2.2, cost;

        cost = (costPerKm * distance);
        cost += opening;

        cost = (cost < 20) ? minCost : cost;
        System.out.println("Total Amount: " + cost);

    }
}
