package teslaTask1.calculateMethods;

import teslaTask1.calculateMethods.exceptions.StrongException;

public class Strong extends TwoNumbersOperations implements Calculator {

    public Strong() {
        this.mathOperator=MathOperator.STRONG;
    }


    @Override
    public String calculate(String expression) {

        double num = getFirstNumber(expression);
        double sum = 1;

        try {
            if ( num % 1 != 0){
                throw new StrongException();
            }
            for (int i = 1; i <= num; i++) {
                sum=sum*i;
            }
        } catch (StrongException e){
            System.out.println("it is not an int number");
        }

        return String.valueOf(sum);
    }
}
