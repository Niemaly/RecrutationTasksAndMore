package teslaTask1.calculateMethods;

public class Dividing extends TwoNumbersOperations implements Calculator {

    public Dividing() {
        this.mathOperator=MathOperator.DIVIDE;
    }

    @Override
    public String calculate(String expression) {
        return String.valueOf(getFirstNumber(expression)/getSecondNumber(expression));
    }
}
