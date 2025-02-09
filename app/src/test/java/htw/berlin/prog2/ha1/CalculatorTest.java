package htw.berlin.prog2.ha1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display result after adding two positive multi-digit numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "40";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after getting the square root of two")
    void testSquareRoot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressUnaryOperationKey("√");

        String expected = "1.41421356";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    //TODO hier weitere Tests erstellen
    @Test
    @DisplayName("should display decimal inversion of 5")
    void testInversion() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(5);
        calc.pressUnaryOperationKey("1/x");

        String expected = "0.2";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("should display result after getting one percent of 100")
    void testPercent() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(1);
        calc.pressDigitKey(0);
        calc.pressDigitKey(0);
        calc.pressUnaryOperationKey("%");

        String expected = "1";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("should display number with only one Dot")
    void testDoubleDot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(5);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressDotKey();

        String expected = "5.5";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
}

