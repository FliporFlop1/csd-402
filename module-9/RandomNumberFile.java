
/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Assignment: Module 9 - Program 2
 * Date: November 8, 2026
 *
 * Purpose:
 * Creates or appends 10 random integers to data.file,
 * then reopens the file and displays its contents.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberFile {

    public static void main(String[] args) {

        Path file = Path.of("data.file");
        Random random = new Random();

        System.out.println("Module 9 - Random Number File Program");
        System.out.println("-------------------------------------");

        try {
            // Determine whether the file already exists.
            boolean fileExists = Files.exists(file);
            boolean hasData = fileExists && Files.size(file) > 0;

            // Append to an existing file or create a new one.
            try (FileWriter writer =
                    new FileWriter(file.toFile(), true)) {

                // Separate new numbers from existing data.
                if (hasData) {
                    writer.write(" ");
                }

                // Generate and write 10 random integers.
                for (int i = 0; i < 10; i++) {
                    int number = random.nextInt(100) + 1;

                    writer.write(Integer.toString(number));

                    if (i < 9) {
                        writer.write(" ");
                    }
                }
            }

            System.out.println(
                fileExists ? "Numbers appended to file."
                           : "New file created."
            );

            // Reopen the file and read its contents.
            System.out.println("\nContents of data.file:");

            try (Scanner reader = new Scanner(file)) {
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
            }

            System.out.println("\nFile operations completed.");

        } catch (IOException e) {
            System.out.println(
                "File operation failed: " + e.getMessage()
            );
        }
    }
}
