class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException, IllegalArgumentException {
        int x;

        if (operation == null) throw new IllegalArgumentException("Operation cannot be null");

        try {
            switch (operation) {
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                case "+" -> x = operand1 + operand2;
                case "*" -> x = operand1 * operand2;
                case "/" -> x = operand1 / operand2;
                default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }

        return String.format("%d %s %d = %d", operand1, operation, operand2, x);
    }
}
