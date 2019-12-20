package teslaTask1.calculateMethods;

import java.util.ArrayList;
import java.util.List;

public enum MathOperator {

    PLUS ('+'),
    MINUS ('-'),
    MULTIPLICATION ('*'),
    DIVIDE ('/'),
    STRONG ('!'),
    POW ('^');

    private char mathOp;
    private static List<Character> list;

    MathOperator(char mathOp){
        this.mathOp=mathOp;
    }

    public char getMathOp() {
        return mathOp;
    }

    public static List<Character> getList() {

        if (list==null){
            list = new ArrayList<>();
            list.add(PLUS.mathOp);
            list.add(MINUS.mathOp);
            list.add(MULTIPLICATION.mathOp);
            list.add(DIVIDE.mathOp);
            list.add(STRONG.mathOp);
        }

        return list;
    }
}
