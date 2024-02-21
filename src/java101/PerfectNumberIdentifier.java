package java101;

import java.util.Scanner;

public class PerfectNumberIdentifier {
    public static void main(String[] args) {

        // Scanner Declaration - Upper Limit Identification
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int upperLimit = scanner.nextInt();

        // Finding All Perfect Numbers Until Upper Limit
        System.out.println("Perfect numbers:");
        for (int i = 2; i <= upperLimit; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}


