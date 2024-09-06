package org.example;
import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame extends Game {
    private int targetNumber;
    private int maxNumber;

    public NumberGuessingGame(String playerName, int maxGuesses, int maxNumber) {
        super(playerName, maxGuesses);
        this.maxNumber = maxNumber;
        Random rand = new Random();
        this.targetNumber = rand.nextInt(maxNumber) + 1; // Random number between 1 and maxNumber
    }

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + playerName + "! Try to guess the number between 1 and " + maxNumber);

        while (guessCount < maxGuesses) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            addGuess(guess);

            if (guess == targetNumber) {
                System.out.println("Congratulations " + playerName + ", you guessed the correct number!");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (guessCount == maxGuesses) {
                System.out.println("Sorry, you've used all your guesses. The correct number was: " + targetNumber);
            }
        }
    }
}

