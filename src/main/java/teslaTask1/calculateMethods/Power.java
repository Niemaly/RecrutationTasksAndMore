package teslaTask1.calculateMethods;

public class Power extends  TwoNumbersOperations implements  Calculator {

    public Power() {
        this.mathOperator=MathOperator.POW;
    }

    @Override
    public String calculate(String expression) {
        return String.valueOf(Math.pow(getFirstNumber(expression), getSecondNumber(expression)));
    }
}
