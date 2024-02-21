package java101;

public class PrimeNumbers {
    public static void main(String[] args) {

        // Variable Declarations
        int start = 1, finish = 100;

        // Printing Prime Numbers
        System.out.println("Prime numbers between 1-100: ");
        for (int i = start; i <= finish; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Identification if Prime Number or not
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
