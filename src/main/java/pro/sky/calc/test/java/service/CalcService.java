package pro.sky.calc.test.java.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(Integer num1, Integer num2) {
        return num1+num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return num1 / num2;
    }
}
