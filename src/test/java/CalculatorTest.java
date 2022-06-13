import org.junit.Assert;
import org.junit.Test;



public class CalculatorTest {
    Calculator calculator;


    @Test
    public void calculatePlus() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, Operations.PLUS, 4.0);
        Assert.assertEquals(8.0, actual, 0.0);
        actual = calculator.calculate(-5.6, Operations.PLUS, -4.4);
        Assert.assertEquals(-10.0, actual, 0.0);
    }
    @Test
    public void calculateMinus() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, Operations.MINUS, 4.0);
        Assert.assertEquals(0.0, actual, 0.0);
        actual = calculator.calculate(-3.45, Operations.MINUS, -874.0);
        Assert.assertEquals(870.55, actual, 0.0);
    }
    @Test
    public void calculateMultiply() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, Operations.MULTIPLY, 4.0);
        Assert.assertEquals(16.0, actual, 0.0);
        actual = calculator.calculate(-43.43, Operations.MULTIPLY, -32.4);
        Assert.assertEquals(1407.132, actual, 0.001);
    }
    @Test
    public void calculateDevide() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, Operations.DEVIDE, 4.0);
        Assert.assertEquals(1.0, actual, 0.001);
        actual = calculator.calculate(-4.45, Operations.DEVIDE, -32.23);
        Assert.assertEquals(0.1381, actual, 0.001);
    }
    @Test
    public void calculateDevideZero() {
        calculator = new Calculator();
        double actual = calculator.calculate(4.0, Operations.DEVIDE, 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, actual, 0.0);
        actual = calculator.calculate(-4.21, Operations.DEVIDE, 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, actual, 0.0);
    }

}