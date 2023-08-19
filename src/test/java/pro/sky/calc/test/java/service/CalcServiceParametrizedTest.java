package pro.sky.calc.test.java.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceParametrizedTest {
    CalcService calcService = new CalcService();

    public static Stream<Arguments> plus() {
        return Stream.of(
                Arguments.of(1, 1, "1 + 1 = 2", "+"),
                Arguments.of(9, 991, "9 + 991 = 1000", "+"),
                Arguments.of(13, 1111, "13 + 1111 = 1124", "+")
        );
    }

    @ParameterizedTest
    @MethodSource("plus")
    void plus(int num1, int num2, String result) {
        assertEquals(result, calcService.plus(num1, num2));
    }

    public static Stream<Arguments> minus() {
        return Stream.of(
                Arguments.of(1, 1, "1 - 1 = 0", "-"),
                Arguments.of(9, 991, "9 - 991 = -982", "-"),
                Arguments.of(1333, 11, "1333 - 11 = 1322", "-")
        );
    }

    @ParameterizedTest
    @MethodSource("minus")
    void minus(int num1, int num2, String result) {
        assertEquals(result, calcService.minus(num1, num2));

    }

    public static Stream<Arguments> multiply() {
        return Stream.of(
                Arguments.of(1, 1, "1 * 1 = 1", "*"),
                Arguments.of(9, 1, "9 * 1 = 9", "*"),
                Arguments.of(11, 11, "11 * 11 = 121", "*")
        );
    }

    @ParameterizedTest
    @MethodSource("multiply")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, calcService.multiply(num1, num2));

    }

    public static Stream<Arguments> divide() {
        return Stream.of(
                Arguments.of(1, 1, "1 / 1 = 1.0", "/"),
                Arguments.of(9, 1, "9 / 1 = 9.0", "/"),
                Arguments.of(11, 11, "11 / 11 = 1.0", "/")
        );
    }

    @ParameterizedTest
    @MethodSource("divide")
    void divide(int num1, int num2, String result) {
        assertEquals(result, calcService.divide(num1, num2));

    }
}