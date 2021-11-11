package com.denmats.guess_number_game;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UserInterfaceTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUP(){
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void makeAGuessTest() throws MyCustomException {
        int guess = UserInterface.validateUserInput("4");
        assertEquals(4,guess);
    }

    @Test()
    public void validateInputMethod_ThrowsException_IfInputIsNotInteger(){
        assertThrows(MyCustomException.class, () -> UserInterface.validateUserInput("some string"));
        assertErrorMessageDisplayed();
    }

    private void assertErrorMessageDisplayed() {
        System.setOut(new PrintStream(outContent));
        assertTrue("Please...".contains(outContent.toString().trim()));
    }

    @Test
    public  void validateInputMethod_NoExceptionIsThrown() throws MyCustomException {
       UserInterface.validateUserInput("3");
        assertNoErrorMessageDisplayed();
    }

    private void assertNoErrorMessageDisplayed() {
        System.setOut(new PrintStream(outContent));
        assertEquals("", outContent.toString().trim());
    }
}