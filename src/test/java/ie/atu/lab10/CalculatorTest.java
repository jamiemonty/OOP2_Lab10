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
}
