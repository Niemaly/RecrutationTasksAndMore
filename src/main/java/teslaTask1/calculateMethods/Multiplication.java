package teslaTask1.calculateMethods;

public class Multiplication extends TwoNumbersOperations implements Calculator{


    public Multiplication() {
        this.mathOperator = MathOperator.MULTIPLICATION;
    }

    @Override
    public String calculate(String expression) {
       return String.valueOf(getFirstNumber(expression)*getSecondNumber(expression));
    }
}
