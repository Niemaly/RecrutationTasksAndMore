package teslaTask1;

import teslaTask1.calculateMethods.MathOperator;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ExpressionValidator {
    public ExpressionValidator() {
    }

    public boolean isItHaveLetters(String string) {

        for (Character character : string.toCharArray()) {
            if (Character.isLetter(character)) {
                return true;
            }
        }

        return false;
    }

    public boolean isItHaveBrackets(String string) {
        if (string.contains("(")) {
            return true;
        }
        return false;
    }

    public boolean isItHaveAnyMathSign(String string) {
        AtomicBoolean isTrue= new AtomicBoolean(false);
        MathOperator mathOperator = null;
        List operators = mathOperator.getList();

        operators.stream().forEach(e->
        {
            if (string.contains(e.toString())){
                isTrue.set(true);
            }

        });

        return isTrue.get();
    }

    public boolean isItNumber(String string) {
        for (Character character : string.toCharArray()) {
            if (!Character.isDigit(character)) {
                return false;
            }
        }

        return true;
    }
}