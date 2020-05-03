import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialCalculatorTest {

    @Test
    public void calculateMichalPatynaSuccess() {
        FactorialCalculator calc = new FactorialCalculator();
        calc.setArgument(1);
        assertEquals(1, calc.calculateMichalPatyna());
        calc.setArgument(5);
        assertEquals(120, calc.calculateMichalPatyna());
    }

    @Test
    public void calculateMichalPatynaFail() {
        FactorialCalculator calc = new FactorialCalculator();
        calc.setArgument(6);
        // używany typ to byte (max liczba 127) więc zwróci nieprawidłowy wynik
        assertNotEquals(720, calc.calculateMichalPatyna());
    }
}