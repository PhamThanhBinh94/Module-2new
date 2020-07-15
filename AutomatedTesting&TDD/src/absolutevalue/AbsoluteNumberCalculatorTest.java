package absolutevalue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Testing Math.abs(number)")
    public void testAbsolute0(){
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(0);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing Math.abs(number)")
    public void testAbsolute1(){
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(1);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing Math.abs(number)")
    public void testAbsoluteNegative1(){
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(-1);
        assertEquals(expected,result);
    }
}