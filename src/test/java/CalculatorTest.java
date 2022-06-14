import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    Calculator calculator;


    @Test
    public void calculatePlus() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, "+", 4.0);
        Assert.assertEquals(8.0, actual, 0.0);
        actual = calculator.calculate(-5.6, "+", -4.4);
        Assert.assertEquals(-10.0, actual, 0.0);
    }

    @Test
    public void calculateMinus() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, "-", 4.0);
        Assert.assertEquals(0.0, actual, 0.0);
        actual = calculator.calculate(-3.45, "-", -874.0);
        Assert.assertEquals(870.55, actual, 0.0);
    }

    @Test
    public void calculateMultiply() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, "*", 4.0);
        Assert.assertEquals(16.0, actual, 0.0);
        actual = calculator.calculate(-43.43, "*", -32.4);
        Assert.assertEquals(1407.132, actual, 0.001);
    }

    @Test
    public void calculateDevide() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, "/", 4.0);
        Assert.assertEquals(1.0, actual, 0.001);
        actual = calculator.calculate(-4.45, "/", -32.23);
        Assert.assertEquals(0.1381, actual, 0.001);
    }

    @Test
    public void calculateDevideZero() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, "/", 0.0);
        Assert.assertEquals(-1.0, actual, 0.0);
        actual = calculator.calculate(-4.21, "/", 0.0);
        Assert.assertEquals(-1.0, actual, 0.0);
    }

    @Test
    public void calculateNullOperation() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, null, 0.0);
        Assert.assertEquals(-1.0, actual, 0.0);
    }

    @Test
    public void calculateDoubleOperation() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, "--", 0.0);
        Assert.assertEquals(-1.0, actual, 0.0);
    }

    @Test
    public void calculateOtherOperations() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, "%", 0.0);
        Assert.assertEquals(-1.0, actual, 0.0);
    }
}