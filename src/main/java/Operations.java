public enum Operations {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");
    public final String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public static Operations getValue(String oper) throws NullPointerException {
        for (Operations e : values()) {
            if (e.operation.equals(oper)) {
                return e;
            }
        }
        throw new UnsupportedOperationException("Operation " + oper + " is not supported");
    }
}
