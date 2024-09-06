package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    Game game;

    @Before
    public void setUp() {
        game = new NumberGuessingGame("TestPlayer", 5, 100);
    }

    @Test
    public void testAddGuess() {
        game.addGuess(50);
        assertEquals(1, game.getGuessCount());
        assertEquals(50, game.getGuesses()[0]);
    }

    @Test
    public void testMaxGuesses() {
        game.addGuess(10);
        game.addGuess(20);
        game.addGuess(30);
        game.addGuess(40);
        game.addGuess(50);
        game.addGuess(60); // Should not add
        assertEquals(5, game.getGuessCount());
    }

    @Test
    public void testPlayerName() {
        assertEquals("TestPlayer", game.getPlayerName());
    }
}
