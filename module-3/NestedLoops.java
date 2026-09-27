/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Assignment: 3 - Nested For Loops
 * Date: September 26, 2026
 *
 * Purpose:
 * This program uses nested for loops to display
 * a pyramid pattern of powers of 2.
 * Each line ends with the @ symbol.
 */

public class NestedLoops {

    public static void main(String[] args) {

        // Controls the seven rows of the pattern.
        for (int row = 0; row < 7; row++) {

            // Add spaces before each row.
            for (int space = 0; space < 6 - row; space++) {
                System.out.print("  ");
            }

            // Display increasing powers of 2.
            int number = 1;

            for (int column = 0; column <= row; column++) {
                System.out.print(number + " ");
                number = number * 2;
            }

            // Move back down through the powers of 2.
            number = number / 4;

            for (int column = row - 1; column >= 0; column--) {
                System.out.print(number + " ");
                number = number / 2;
            }

            // Required symbol at the end of every row.
            System.out.println("@");
        }
    }
}