package java102.Practice;

import java.io.*;

public class readerPractice {
    public static void main(String[] args) {

        // Reading the numbers from the file
        try (BufferedReader br = new BufferedReader(new FileReader("src/java102/Practice/myFile.txt"))) {
            String line;
            int total = 0;
            while ((line = br.readLine()) != null) {
                total += Integer.parseInt(line);
            }
            System.out.println(total);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in the file.");
            e.printStackTrace();
        }

    }
}
