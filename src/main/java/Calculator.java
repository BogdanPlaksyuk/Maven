public class Calculator {
    public Double calculate(double a, String operation, double b) {
        Operations o = Operations.getValue(operation);
        if (o == null||b==0) {
            return -1.0;
        }
        switch (o) {
            case PLUS:
                return (a + b);
            case MINUS:
                return (a - b);
            case MULTIPLY:
                return (a * b);
            case DIVIDE:
                return (a / b);
        }
        return -1.0;
    }
}
