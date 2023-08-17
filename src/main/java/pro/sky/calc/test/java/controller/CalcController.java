package pro.sky.calc.test.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calc.test.java.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping()
    public String welcome() {
        return calcService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + "+" + num2 + "=" + calcService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + "-" + num2 + "=" + calcService.minus(num1, num2);
    }


    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + "*" + num2 + "=" + calcService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {


            return num1 + "/" + num2 + "=" + calcService.divide(num1, num2);

    }
}
