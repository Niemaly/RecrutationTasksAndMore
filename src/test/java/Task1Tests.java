import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import teslaTask1.Solution;
import teslaTask1.calculateMethods.Addition;

import java.util.stream.Stream;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Task1Tests {

    private static Stream<Arguments> provideDataForTask1Solution() {
        return Stream.of(
                Arguments.of("a=b+4 b=c+d d=4 c=3+2",  "d=4 c=5 b=9 a=13"   )
        );
    }

    private static Stream<Arguments> provideDataToAddingMethod() {
        return Stream.of(
                Arguments.of("2+1",  "3.0"   ),
                Arguments.of("2+18",  "20.0"   ),
                Arguments.of("-142+1",  "-141.0"   ),
                Arguments.of("0+0",  "0.0"   )
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForSolutionWithSmallestIntThatIsNotInArray")
    public void smallestIntThatIsNotInArrayTestShouldCheckIsNumberIsNotInArray(String input, String expected){

        Solution sol = new Solution();
        assertTrue(sol.solution(input).equals(expected));
    }

    @ParameterizedTest
    @MethodSource("provideDataToAddingMethod")
    public void shouldReturnAddition(String input, String expected){

        Addition addition = new Addition();
        assertTrue(addition.calculate(input).equals(expected));
    }

    @Test
    public void shouldThrowExceptionWhenItIsBadExpression(){

        Addition addition = new Addition();

        String notExpression = "asa";
        String notExpression1 = "121-";
        String notExpression2 = "2+1=";
        String notExpression3 = "2+2+2";

        assertThrows(StringIndexOutOfBoundsException.class, () ->addition.calculate(notExpression));
        assertThrows(StringIndexOutOfBoundsException.class, () ->addition.calculate(notExpression1));
        assertThrows(NumberFormatException.class, () ->addition.calculate(notExpression2));
        assertThrows(NumberFormatException.class, () ->addition.calculate(notExpression3));

    }
}
