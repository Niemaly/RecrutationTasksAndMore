package teslaTask1.calculateMethods;

import teslaTask1.calculateMethods.Calculator;

public class Addition extends TwoNumbersOperations implements Calculator {
    public Addition() {
        this.mathOperator=MathOperator.PLUS;
    }

    @Override
    public String calculate(String expression) {
        return String.valueOf(getFirstNumber(expression)+getSecondNumber(expression));
    }

}
