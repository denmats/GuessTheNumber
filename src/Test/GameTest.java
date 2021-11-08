package Test;


import com.denmats.guess_number_game.Game;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

/*    @BeforeAll
    public void setUP(){
        System.setOut(new PrintStream(outContent));
        game = new Game(1,100);
    }*/

   /* @Test
    public void playGameTest(){
        game = new Game(1,100);

    }

    @Test
    public void checkIfTheGuessNumberIsWithinTheRange1To100Test(){
        game = new Game(1,100);
        game.setGuess(1);
        game.checkIfTheGuessNumberIsWithinTheRange1To100();
        assertEquals(1,game.getGuess());
    }

    @Test
    public  void userProviderIntegerNumber() throws MyCustomException {
        game = new Game(1,100);
        game.validateUserInput("3");
        assertNoErrorMessageDisplayed();
    }

    private void assertNoErrorMessageDisplayed() {
        System.setOut(new PrintStream(outContent));
        assertEquals("", outContent.toString().trim());
    }

    @Test()
    public void userProvidedNotIntegerNumber() throws MyCustomException {
        game = new Game(1,100);
        MyCustomException exception = assertThrows(MyCustomException.class, () -> {
            game.validateUserInput("some string");
        });
        assertErrorMessageDisplayed();
    }

    private void assertErrorMessageDisplayed() {
        System.setOut(new PrintStream(outContent));
        assertTrue("Please...".contains(outContent.toString().trim()));
    }


    @Test
    public void checkIfTheNumberGeneratedFromTheRange(){
        Game game = new Game(1,100);
        assertTrue(game.secretNumber >=1 && game.secretNumber <= 100, "The secret number suits the given range");
    }

    @Test
    public void checkIfTheNumberGeneratedIsEqualToMinValueFromTheRange(){
        Game game = new Game(1,1);
        assertEquals(1,game.secretNumber);
    }

    @Test
    public void checkIfTheNumberGeneratedIsEqualToMaxValueFromTheRange(){
        Game game = new Game(100,100);
        assertEquals(100,game.secretNumber);
    }*/
}