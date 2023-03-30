package C01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void subtract() {
        assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    void multiply() {
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(4, 2));
    }
}
