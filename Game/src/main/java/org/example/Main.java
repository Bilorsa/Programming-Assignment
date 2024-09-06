package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame("Player1", 5, 100);
        game.start();

        // Display guesses
        System.out.println("Your guesses were: ");
        for (int i = 0; i < game.getGuessCount(); i++) {
            System.out.print(game.getGuesses()[i] + " ");
        }
    }
}