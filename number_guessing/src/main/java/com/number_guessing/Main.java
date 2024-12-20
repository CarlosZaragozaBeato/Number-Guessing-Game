package com.number_guessing;

import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static final Map<Integer, String> DIFFICULTY_MAP = Map.of(
            1, "Easy",
            2, "Medium",
            3, "Hard");

    private static final Map<Integer, Integer> GUESSES_MAP = Map.of(
            1, 10, // Adjusted to include the correct number of chances
            2, 5,
            3, 3);

    public static void main(String[] args) {
        displayWelcomeMessage();
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YOUR CHOICE: ");
        int difficulty = readIntegerInput(sc, "Invalid choice. Please enter a number.");

        if (!DIFFICULTY_MAP.containsKey(difficulty)) {
            System.out.println("Invalid difficulty level. Please choose 1 (Easy), 2 (Medium), or 3 (Hard).");
            return;
        }

        playGame(difficulty, sc);
    }

    private static void displayWelcomeMessage() {
        System.out.println("""
                Welcome to the Number Guessing Game!
                I'm thinking of a number between 1 and 100.

                Please select the difficulty level:
                1. Easy (10 chances)
                2. Medium (5 chances)
                3. Hard (3 chances)
                """);
    }

    private static void playGame(int difficulty, Scanner sc) {
        int maxGuesses = GUESSES_MAP.get(difficulty);
        String difficultyName = DIFFICULTY_MAP.get(difficulty);

        System.out.println("Great! You have selected " + difficultyName + " difficulty.\nLet's start the game!");
        int randomInt = ThreadLocalRandom.current().nextInt(1, 101);

        for (int attempt = 1; attempt <= maxGuesses; attempt++) {
            System.out.print("Attempt " + attempt + " of " + maxGuesses + ". Enter your guess: ");
            int guess = readIntegerInput(sc, "Please enter a valid number.");

            if (guess == randomInt) {
                System.out.println("Congratulations! You guessed the correct number in " + attempt + " attempts.");
                return;
            } else if (guess > randomInt) {
                System.out.println("Incorrect! The number is less than " + guess + ".");
            } else {
                System.out.println("Incorrect! The number is greater than " + guess + ".");
            }
        }

        System.out.println("You've used all your attempts! The correct number was: " + randomInt);
    }

    private static int readIntegerInput(Scanner sc, String errorMessage) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
}
