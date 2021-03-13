package calc;

import course.task_5.operations.Add;
import course.task_5.operations.Divide;
import course.task_5.operations.Multiply;
import course.task_5.operations.Subtract;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

public class CalcTests {

@ParameterizedTest
@MethodSource("addParams")
    public void testAddWith5Params(double num1, double num2, double result){
    Add add = new Add();
    assertEquals(result, add.operate(num1, num2));
}

    private static Stream<Arguments> addParams() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(2, 4, 6),
                Arguments.of(15, -10, 5),
                Arguments.of(212, 12, 224),
                Arguments.of(31, 33, 64)
        );
    }

    @ParameterizedTest
    @MethodSource("subtractParams")
    public void testSubtractWith5Params(double num1, double num2, double result){
        Subtract subtract = new Subtract();
        assertEquals(result, subtract.operate(num1, num2));
    }

    private static Stream<Arguments> subtractParams() {
        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(2, 4, -2),
                Arguments.of(15, -10, 25),
                Arguments.of(43, 13, 30),
                Arguments.of(-111, -111, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    public void testMultiplyWith5Params(double num1, double num2, double result){
        Multiply multiply = new Multiply();
        assertEquals(result, multiply.operate(num1, num2));
    }
    public  static Stream<Arguments> multiplyParams(){
        return Stream.of(
                Arguments.of(10, 10, 100),
                Arguments.of(12, 3, 36),
                Arguments.of(1, 1021, 1021),
                Arguments.of(21, -2, -42),
                Arguments.of(-11, -11, 121)
        );
    }

    @ParameterizedTest
    @MethodSource("divideWithoutExceptionParams")
    public void testDivideWithoutException(double num1, double num2, double result){
        Divide divide = new Divide();
        assertEquals(result, divide.operate(num1, num2));
    }

    public static Stream<Arguments> divideWithoutExceptionParams(){
    return Stream.of(
        Arguments.of(12, 2, 6),
        Arguments.of(100, 10, 10),
        Arguments.of(333, -111, -3),
        Arguments.of(1, 5, 0.2),
        Arguments.of(6, 12, 0.5)
        );
    }

    @Test
    public void testDivideWithException(){
    Divide divide = new Divide();
    Exception exception = assertThrows(ArithmeticException.class, ()-> divide.operate(12, 0));
        System.out.println(exception.getMessage());
    assertEquals("Error: divide by zero. In our world we can`t divide by zero.", exception.getMessage());
    }
}
