package teslaTask1.calculateMethods;

public class Subtraction extends TwoNumbersOperations implements Calculator {

    public Subtraction() {
        this.mathOperator = MathOperator.MINUS;
    }

    @Override
    public String calculate(String expression) {
        return String.valueOf(getFirstNumber(expression)-getSecondNumber(expression));
    }
}
