package ie.atu.lab10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator newCalc;
    @Test
    void testAdd()
    {
        newCalc = new Calculator();
        assertEquals(10, newCalc.add(4,6));
    }

    @Test
    void testSubtract()
    {
        newCalc = new Calculator();
        assertEquals(2, newCalc.subtract(6, 4));
    }

    @Test
    void testDivide()
    {
        newCalc = new Calculator();
        assertEquals(2, newCalc.divide(6, 3));
    }

    @Test
    void testMultiply()
    {
        newCalc = new Calculator();
        assertEquals(18, newCalc.multiply(6, 3));
    }
}
