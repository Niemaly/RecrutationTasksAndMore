package teslaTask1.calculateMethods;

public abstract class TwoNumbersOperations {

    double firstNumber;
    double secondNumber;
    MathOperator mathOperator;

    double getFirstNumber(String expression){

        this.firstNumber= Double.parseDouble(expression.substring(0,expression.indexOf(mathOperator.getMathOp())));
        return firstNumber;
    }


    double getSecondNumber(String expression){
        this.secondNumber =  Double.parseDouble(expression.substring(expression.indexOf(mathOperator.getMathOp())+1));
        return secondNumber;

    }

    public MathOperator getMathOperator() {
        return mathOperator;
    }
}
