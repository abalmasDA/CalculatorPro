public class CalculatorPro extends Calculator {
    private static final String INVALID_INPUT_NUMBER = "Your enter wrong format number";
    private static final String INVALID_INPUT_OPERATION = "Your enter wrong operation";
    static final String DIVISION_BY_ZERO = "You can't divide by zero";
    private static final String OUTPUT_RESULT = "Result: ";

    @Override
    public double getOperand(String operand) {
        double number = 0;
        try {
            number = Double.parseDouble(operand);

        } catch (Exception e) {
            System.out.println(INVALID_INPUT_NUMBER);
            System.exit(1);
        }
        return number;
    }

    @Override
    public String getOperation(String operation) {
        String oper = null;
        try {
            if ((operation.equalsIgnoreCase("+")) | (operation.equalsIgnoreCase("-")) | (operation.equalsIgnoreCase("*")) | (operation.equalsIgnoreCase("/"))) {
                oper = operation;
            } else {
                throw new IllegalArgumentException(INVALID_INPUT_OPERATION);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return oper;
    }

    @Override
    public void calculation(double operand1, double operand2, String operation) {

        switch (operation) {
            case "+":
                System.out.println(OUTPUT_RESULT + adding(operand1, operand2));
                break;
            case "-":
                System.out.println(OUTPUT_RESULT + subtraction(operand1, operand2));
                break;
            case "*":
                System.out.println(OUTPUT_RESULT + multiplication(operand1, operand2));
                break;
            case "/":
                System.out.println(OUTPUT_RESULT + division(operand1, operand2));
                break;
        }

    }

    @Override
    public double adding(double operand1, double operand2) {
        return operand1 + operand2;
    }

    @Override
    public double subtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }

    @Override
    public double multiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }

    @Override
    public double division(double operand1, double operand2) {
        double div = 0;
        try {
            if (operand2 == 0) {
                throw new ArithmeticException(DIVISION_BY_ZERO);
            } else {
                div = operand1 / operand2;
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        return div;
    }


}
