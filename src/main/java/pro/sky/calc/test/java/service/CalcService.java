package pro.sky.calc.test.java.service;


import org.springframework.stereotype.Service;
import pro.sky.calc.test.java.exception.DontDivideByZeroException;

@Service
public class CalcService {


    public String greetings() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return getResult(num1, num2, "+", Integer.toString(result));
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return getResult(num1, num2, "-", Integer.toString(result));
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return getResult(num1, num2, "*", Integer.toString(result));
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DontDivideByZeroException("На ноль делить нельзя!");
        }

        double result = (double) num1 / num2;
        return getResult(num1, num2, "/", Double.toString(result));
    }

    private String getResult(int num1, int num2, String operation, String result) {
        return String.format("%s %s %s = %s", num1, operation, num2, result);
    }
}
