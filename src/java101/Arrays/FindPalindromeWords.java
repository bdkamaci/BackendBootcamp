package java101.Arrays;

import java.util.Scanner;

public class FindPalindromeWords {

    // Function to find whether a word is Palindrome or not
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner Declaration
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the word you would like to classify: ");
        String word = input.nextLine();

        System.out.println(word + " : " + isPalindrome(word));

    }
}
