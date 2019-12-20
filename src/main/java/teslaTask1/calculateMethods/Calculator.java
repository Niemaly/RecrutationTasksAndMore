package teslaTask1.calculateMethods;

import teslaTask1.calculateMethods.exceptions.NotCorrectExpressionException;

public interface Calculator {

    String calculate(String expression) throws NotCorrectExpressionException;
    public MathOperator getMathOperator();
}
