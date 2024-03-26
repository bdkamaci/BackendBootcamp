package java102.MostOccuredWordFinder;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Scanner Declaration and Getting User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text below!");
        String text = scanner.nextLine();

        // Splitting the input into words
        String[] words = text.split("\\s+");

        // Looking through words with loop
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            word = word.toLowerCase();

            if(wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        String mostUsedWord = "";
        int maxOccurance = 0;

        // Finding the word which has the maximum number of occurrences
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if(entry.getValue() > maxOccurance) {
                maxOccurance = entry.getValue();
                mostUsedWord = entry.getKey();
            }
        }

        // Printing results
        System.out.println("The word with maximum number occurances: " + mostUsedWord + " with " + maxOccurance + " times.");

    }
}
