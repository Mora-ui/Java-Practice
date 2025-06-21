package projectsbeginner;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

class NumberGuessingGame {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("What is your name? ");
            String playerName = keyboard.nextLine();

            int secret = randomMethod(100);

            System.out.println("Welcome " + playerName + " to the number guessing game!");
            System.out.println("Please guess the number from 1 to 100 (int only)");

            int attempts = 0;

            while (true) {
                System.out.print("Enter your guess: ");
                try {
                    int userGuess = keyboard.nextInt();
                    keyboard.nextLine(); // clear newline

                    attempts++;

                    if (userGuess == secret) {
                        System.out.println("Congrats, you got it right! Good job!");
                        System.out.println("It took you " + attempts + " attempt(s).");
                        break;
                    } else if (userGuess < secret) {
                        System.out.println("Too low, try again.");
                    } else {
                        System.out.println("Too high, try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, please enter a number between 1 and 100.");
                    keyboard.nextLine(); // clear invalid input
                }
            }

            System.out.println("Would you like to try again? (yes or no)");
            String answer = keyboard.nextLine();

            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }

    public static int randomMethod(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }
}