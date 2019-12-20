package teslaTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BracketsStackCalculator {
    Stack<Character> stackWithBracketExpression;
    String expresion;
    List<String> listOfExpressions;
    CalculatorImpl calculator;
    ExpressionValidator expressionValidator = new ExpressionValidator();

    public BracketsStackCalculator(String expresion) {
        this.stackWithBracketExpression = new Stack<>();
        this.listOfExpressions = new ArrayList<>();
        this.calculator = new CalculatorImpl();
    }


    public String calculateBracketExpression(String expression){

        char newCharacter;
        String newExpresion = expression;

        while(run(newExpresion)){
            for (Character character : newExpresion.toCharArray()) {

                if (character!=')'){
                    stackWithBracketExpression.push(character);
                }

                if (character==')'){
                    StringBuilder sb = new StringBuilder();
                    do {
                        newCharacter = stackWithBracketExpression.peek();

                        if (newCharacter!='(') {
                            sb.append(stackWithBracketExpression.pop());
                        }else {
                            stackWithBracketExpression.pop();
                            if (!expressionValidator.isItHaveBrackets(sb.toString())){
                                this.listOfExpressions.add(sb.toString());
                            } else {
                                calculateBracketExpression(sb.toString());
                            }

                        }
                    } while(newCharacter!='(');

                }


            }

        }

        return "";
    }

    private boolean run(String expression){
        ExpressionValidator expressionValidator = new ExpressionValidator();
        if (expressionValidator.isItHaveBrackets(expression)){
            return true;
        }
        return false;
    }




}
