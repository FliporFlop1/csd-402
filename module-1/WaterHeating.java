/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Module: 1
 * Assignment: Water Heating Energy Calculator
 * Date: September 13, 2026
 *
 * This program calculates the amount of energy required
 * to heat water from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class WaterHeating {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the amount of water in kilograms: ");
            double waterMass = input.nextDouble();

            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemperature = input.nextDouble();

            System.out.print("Enter the final temperature in Celsius: ");
            double finalTemperature = input.nextDouble();

            double energy =
                    waterMass * (finalTemperature - initialTemperature) * 4184;

            System.out.printf(
                    "%nThe energy needed to heat the water is %.2f joules.%n",
                    energy
            );

        } catch (Exception e) {
            System.out.println(
                    "Invalid input. Please enter numeric values only."
            );
        } finally {
            input.close();
        }
    }
}