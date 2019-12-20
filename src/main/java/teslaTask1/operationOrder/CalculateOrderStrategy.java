package teslaTask1.operationOrder;

import teslaTask1.calculateMethods.MathOperator;

public interface CalculateOrderStrategy {

    String cutText(String expression);
    MathOperator getMathOperator();

}
