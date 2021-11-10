package Test;

import com.denmats.guess_number_game.SecretNumberGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretNumberGeneratorTest {

    @Test
    public void checkIfTheNumberGeneratedFromTheRange() {
        int secret = SecretNumberGenerator.getRandomNumberFromTheGivenRange(1, 100);
        assertTrue(secret >= 1 && secret <= 100, "The secret number suits the given range");
    }

    @Test
    public void checkIfTheSecretGeneratesCorrectly_WhenMinAndMaxValueOfTheRangeIsConfused() {
        int secret = SecretNumberGenerator.getRandomNumberFromTheGivenRange(100, 1);
        assertTrue(secret >= 1 && secret <= 100, "The secret number suits the given range");
    }

    @Test
    public void checkIfTheNumberGeneratedIsEqualToMinValueFromTheRange() {
        var secret = SecretNumberGenerator.getRandomNumberFromTheGivenRange(1, 1);
        assertEquals(1, secret);
    }

    @Test
    public void checkIfTheNumberGeneratedIsEqualToMaxValueFromTheRange() {
        var secret = SecretNumberGenerator.getRandomNumberFromTheGivenRange(100, 100);
        assertEquals(100, secret);
    }

}