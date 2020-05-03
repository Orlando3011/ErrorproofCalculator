import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciCalculatorTest {

    @Test
    public void calculateMichalPatynaSuccess() {
        FibonacciCalculator calc = new FibonacciCalculator();
        calc.setElement(1);
        assertEquals(1, calc.calculateMichalPatyna());
        calc.setElement(10);
        assertEquals(55, calc.calculateMichalPatyna());
    }

    @Test
    public void calculateMichalPatynaFail() {
        FibonacciCalculator calc = new FibonacciCalculator();
        calc.setElement(12);
        // używany typ to byte (max liczba 127) więc zwróci nieprawidłowy wynik
        assertNotEquals(144, calc.calculateMichalPatyna());
    }
}