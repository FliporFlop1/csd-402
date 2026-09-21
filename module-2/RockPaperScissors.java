/*
 * Author: Jadon Argo
 * Course: CSD 402 - Java for Programmers
 * Module: 2
 * Assignment: 2.2 - Rock-Paper-Scissors
 * Date: September 20, 2026
 *
 * Purpose:
 * This program simulates a game of Rock-Paper-Scissors.
 * The computer randomly selects Rock, Paper, or Scissors,
 * and the user enters a selection of 1, 2, or 3.
 * The program displays both selections and determines the winner.
 */

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Generate a random number from 1 through 3.
        int computerChoice = (int)(Math.random() * 3) + 1;

        System.out.println("Rock-Paper-Scissors");
        System.out.println("-------------------");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1, 2, or 3): ");

        int userChoice = input.nextInt();

        // Check that the user entered a valid selection.
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid selection. Please enter 1, 2, or 3.");
        } else {

            String computerSelection = "";
            String userSelection = "";

            // Determine the computer's selection.
            switch (computerChoice) {
                case 1:
                    computerSelection = "Rock";
                    break;
                case 2:
                    computerSelection = "Paper";
                    break;
                case 3:
                    computerSelection = "Scissors";
                    break;
            }

            // Determine the user's selection.
            switch (userChoice) {
                case 1:
                    userSelection = "Rock";
                    break;
                case 2:
                    userSelection = "Paper";
                    break;
                case 3:
                    userSelection = "Scissors";
                    break;
            }

            System.out.println();
            System.out.println("Computer selected: " + computerSelection);
            System.out.println("You selected: " + userSelection);

            // Determine the result of the game.
            if (userChoice == computerChoice) {
                System.out.println("Result: It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("Result: You win!");
            } else {
                System.out.println("Result: Computer wins!");
            }
        }

        input.close();
    }
}