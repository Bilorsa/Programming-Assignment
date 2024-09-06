package org.example;

class Game {
    protected String playerName;
    protected int[] guesses;
    protected int maxGuesses;
    protected int guessCount;

    public Game(String playerName, int maxGuesses) {
        this.playerName = playerName;
        this.maxGuesses = maxGuesses;
        this.guesses = new int[maxGuesses];
        this.guessCount = 0;
    }

    public void addGuess(int guess) {
        if (guessCount < maxGuesses) {
            guesses[guessCount++] = guess;
        } else {
            System.out.println("No more guesses left!");
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public int[] getGuesses() {
        return guesses;
    }

    public int getGuessCount() {
        return guessCount;
    }

    // Base method for starting the game (to be overridden)
    public void start() {
        System.out.println("Starting the game...");
    }
}