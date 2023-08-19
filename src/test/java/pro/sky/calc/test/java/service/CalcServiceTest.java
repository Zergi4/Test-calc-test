package pro.sky.calc.test.java.service;

import org.junit.jupiter.api.Test;
import pro.sky.calc.test.java.exception.DontDivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {
    private final CalcService calcService = new CalcService();
    @Test
    void greetings_success() {
        String expectedResult = "Добро пожаловать в калькулятор!";
        String actualResult = calcService.greetings();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void plus_success() {
        //подготовка вх данных
        int num1 = 2;
        int num2 = 4;
        //подготовка ожидаемого рез-та
        String expectedResult = TestUtils.formatResult(num1,num2,"+","6");
        //начало теста
        String actualResult = calcService.plus(num1, num2);
        assertEquals(expectedResult,actualResult);
    }
@Test
    void minus_success() {
        //подготовка вх данных
        int num1 = 2;
        int num2 = 4;
        //подготовка ожидаемого рез-та
        String expectedResult = TestUtils.formatResult(num1,num2,"-","-2");
        //начало теста
        String actualResult = calcService.minus(num1, num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void multiply_success() {
        //подготовка вх данных
        int num1 = 2;
        int num2 = 4;
        //подготовка ожидаемого рез-та
        String expectedResult = TestUtils.formatResult(num1,num2,"*","8");
        //начало теста
        String actualResult = calcService.multiply(num1, num2);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void divide_success() {
        //подготовка вх данных
        int num1 = 2;
        int num2 = 4;
        //подготовка ожидаемого рез-та
        String expectedResult = TestUtils.formatResult(num1,num2,"/","0.5");
        //начало теста
        String actualResult = calcService.divide(num1, num2);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void divide_Num2IsZero() {
        //подготовка вх данных
        int num1 = 2;
        int num2 = 0;
        //подготовка ожидаемого рез-та
               assertThrows(DontDivideByZeroException.class, () -> {
           calcService.divide(num1, num2);
       });
    }
}