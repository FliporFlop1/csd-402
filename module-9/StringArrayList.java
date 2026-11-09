
/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Assignment: Module 9 - Program 1
 * Date: November 8, 2026
 *
 * Purpose:
 * Demonstrates ArrayList, for-each loops,
 * autoboxing, auto-unboxing, and exception handling.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {

    public static void main(String[] args) {

        ArrayList<String> vehicles = new ArrayList<>();

        // Add 10 strings to the ArrayList.
        vehicles.add("BMW");
        vehicles.add("Toyota");
        vehicles.add("Honda");
        vehicles.add("Ford");
        vehicles.add("Chevrolet");
        vehicles.add("Mercedes-Benz");
        vehicles.add("Audi");
        vehicles.add("Nissan");
        vehicles.add("Subaru");
        vehicles.add("Volkswagen");

        System.out.println("Module 9 - ArrayList Program");
        System.out.println("----------------------------");

        // Display the collection using a for-each loop.
        int number = 1;

        for (String vehicle : vehicles) {
            System.out.println(number + ". " + vehicle);
            number++;
        }

        Scanner input = new Scanner(System.in);

        System.out.print(
            "\nEnter the number of the vehicle to see again (1-10): "
        );

        String userInput = input.nextLine();

        try {
            // Convert the user's String input to an Integer.
            Integer selected = Integer.valueOf(userInput);

            // Demonstrate autoboxing.
            Integer boxedIndex = selected.intValue();

            // Demonstrate auto-unboxing.
            int index = boxedIndex - 1;

            // Retrieve the selected element.
            System.out.println(
                "Selected vehicle: " + vehicles.get(index)
            );

        } catch (IndexOutOfBoundsException e) {
            System.out.println(
                "Exception has been thrown: Out of Bounds"
            );

        } catch (NumberFormatException e) {
            System.out.println(
                "Invalid input: Please enter a whole number."
            );
        }

        input.close();
    }
}
