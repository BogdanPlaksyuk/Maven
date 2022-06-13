public class Calculator {
    public Double calculate(double a, Operations operation, double b){
        switch (operation){
            case PLUS:
                return (a+b);
            case MINUS:
                return (a-b);
            case MULTIPLY:
                return (a*b);
            case DEVIDE:
                return (a/b);
        }
        return -1.0;
    }
}
