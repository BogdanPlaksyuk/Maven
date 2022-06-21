import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;


public class CalculatorTest {
    Calculator calculator;


    @Test
    public void calculatePlus() {
        calculator = new Calculator();
        String actual = calculator.calculate("4.0", "+", "4.0");
        Assert.assertEquals(actual, "8.0");
        actual = calculator.calculate("-5.6", "+", "-4.4");
        Assert.assertEquals(actual, "-10.0");
    }

    @Test
    public void calculateMinus() {
        calculator = new Calculator();
        String actual = calculator.calculate("4.0", "-", "4.0");
        Assert.assertEquals(actual, "0.0");
        actual = calculator.calculate("-3.45", "-", "-874.0");
        Assert.assertEquals(actual, "870.55");
    }

    @Test
    public void calculateMultiply() {
        calculator = new Calculator();
        String actual = calculator.calculate("4.0", "*", "4.0");
        Assert.assertEquals(actual, "16.0");
        actual = calculator.calculate("-43.43", "*", "-32.4");
        Assert.assertEquals(actual, "1407.1319999999998");
    }

    @Test
    public void calculateDevide() {
        calculator = new Calculator();
        String actual = calculator.calculate("4.0", "/", "4.0");
        Assert.assertEquals(actual, "1.0");
        actual = calculator.calculate("-4.45", "/", "-32.23");
        Assert.assertEquals(actual, "0.1380701210052746");
    }

    @Test
    public void calculateDevideZero() {
        calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.calculate("4.0", "/", "0.0"));
        assertThrows(ArithmeticException.class, () -> calculator.calculate("-4.121", "/", "0.0"));
    }

    @Test
    public void calculateNullOperation() {
        calculator = new Calculator();
        assertThrows(UnsupportedOperationException.class, () -> calculator.calculate("32.3", null, "3.23"));
    }

    @Test
    public void calculateDoubleOperation() {
        calculator = new Calculator();
        assertThrows(UnsupportedOperationException.class, () -> calculator.calculate("4.0", "--", "0.0"));
    }

    @Test
    public void calculateOtherOperations() {
        calculator = new Calculator();
        assertThrows(UnsupportedOperationException.class, () -> calculator.calculate("4.0", "%", "0.0"));
    }
    @Test
    public void calculateNotNumeric() {
        calculator = new Calculator();
        String actual = calculator.calculate("df", "+", "fd");
        Assert.assertNull(actual);
    }
}