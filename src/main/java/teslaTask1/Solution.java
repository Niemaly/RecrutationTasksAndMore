package teslaTask1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class Solution {
    private final ExpressionValidator expressionValidator = new ExpressionValidator();

    //   write a command-line program to evaluate a set of  equations. Like: a=b+4 b=c+d d=4 c=3+2

    public String solution(String input) {

        String [] tableWithVariables = input.split(" ");

        Map<Character, String> mapWithVariables = new HashMap<>();

        for (String variable: tableWithVariables) {
            String [] var = variable.split("=");
            mapWithVariables.put(var[0].charAt(0), var[1]);
        }

        while (run(mapWithVariables)){



        }







        return null;
    }

    public String calculate(String string){
        if (expressionValidator.isItNumber(string)){
            return string;
        }

        if (expressionValidator.isItHaveBrackets(string)){
            return string.substring(0,string.indexOf("(")) + calculate(string.substring(string.indexOf("("), string.indexOf(")")));
        }

        return "";


    }



    public boolean run(Map<Character, String> variableMap){
        AtomicBoolean run = new AtomicBoolean(false);
        variableMap.forEach((var, string)->{
                    for (Character character:string.toCharArray()) {
                        if (!Character.isDigit(character) || character!='.'){
                            run.set(true);
                        }
                    }
                }
                );
        return run.get();
    }



}
