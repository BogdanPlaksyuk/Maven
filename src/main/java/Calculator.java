public class Calculator {
    public String calculate(String a, String operation, String b) throws NumberFormatException, ArithmeticException {

        try {
            Operations o = Operations.getValue(operation);

            switch (o) {
                case PLUS:
                    return Double.toString(Double.parseDouble(a) + Double.parseDouble(b));
                case MINUS:
                    return Double.toString(Double.parseDouble(a) - Double.parseDouble(b));
                case MULTIPLY:
                    return Double.toString(Double.parseDouble(a) * Double.parseDouble(b));
                case DIVIDE:
                    if (Double.parseDouble(b) != 0) {
                        return Double.toString(Double.parseDouble(a) / Double.parseDouble(b));
                    } else throw new ArithmeticException("You are trying to divide <a> by zero");
            }
        } catch (CalculatorException e) {
            System.err.println("Not numeric");
        }
        return null;
    }
}
