package teslaTask1;

import teslaTask1.calculateMethods.exceptions.NotCorrectExpressionException;

public class Main {
    public static void main(String[] args) {

        CalculatorImpl calculator = new CalculatorImpl();

        String expression = "12^5";

        try {
            System.out.println(calculator.calculate(expression));
        } catch (NotCorrectExpressionException e) {
            System.out.println("expression is not cut well");
        }

    }
}
