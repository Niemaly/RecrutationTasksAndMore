package teslaTask1;

import teslaTask1.calculateMethods.*;
import teslaTask1.calculateMethods.exceptions.NoSuchCalculatorException;
import teslaTask1.calculateMethods.exceptions.NotCorrectExpressionException;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl {

    Calculator calculator;


    public CalculatorImpl() {
    }

    public String calculate(String expression) throws NotCorrectExpressionException {
        return pickStrategy(expression).calculate(expression);
    }

    private Calculator pickStrategy(String expresion){
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Power power = new Power();
        Multiplication multiplication = new Multiplication();
        Dividing dividing = new Dividing();
        Strong strong = new Strong();

        List<Calculator> list = new ArrayList<>();

        list.add(addition);
        list.add(subtraction);
        list.add(power);
        list.add(multiplication);
        list.add(dividing);
        list.add(strong);

        for (Calculator calculator: list) {
            if (expresion.contains(String.valueOf(calculator.getMathOperator().getMathOp()))){
                return calculator;
            }
        }

        throw new NoSuchCalculatorException();
    }


}
