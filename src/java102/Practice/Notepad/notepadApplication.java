package java102.Practice.Notepad;

import java.util.Scanner;
import java.io.*;

public class notepadApplication {
    public static void main(String[] args) {

        // Scanner Declaration & Getting User Input
        Scanner scanner = new Scanner(System.in);
        String fileName = "src/java102/Practice/Notepad/notepadFile.txt";

        // Reading the last written text
        String lastText = read(fileName);
        if (lastText != null) {
            System.out.println("Last written text: ");
            System.out.println(lastText);
        } else {
            System.out.println("There is nothing yet to read!");
        }

        // Getting user input for text writing
        System.out.print("Enter the text: ");
        String newText = scanner.nextLine();

        // Writing into the doc
        save(fileName, newText);

        System.out.println("Text has written into document successfully!");


    }

    // Method to read from a file
    public static String read(String fileName) {
        String text = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            text = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File reading exception: " + e.getMessage());
        }
        return text;
    }

    // Method to write to a file
    public static void save(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("File writing exception: " + e);
        }
    }
}
