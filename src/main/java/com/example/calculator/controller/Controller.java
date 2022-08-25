package com.example.calculator.controller;

import com.example.calculator.serviceCalculator.ServiceCalc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final ServiceCalc serviceCalc;

    public Controller(ServiceCalc serviceCalc) {
        this.serviceCalc = serviceCalc;
    }
    @GetMapping()
    public String showCalc() {
        return "Добро пожаловать в калькулятор!";
    }
    @GetMapping("/plus")
    public int sumPlus(@RequestParam(required = true) int num1,
                   @RequestParam(required = true) int num2){
        return serviceCalc.getRequestPlus(num1,num2);
    }
    @GetMapping("/minus")
    public int sumMinus(@RequestParam(required = true) int num1,
                       @RequestParam(required = true) int num2){
        return serviceCalc.getRequestMinus(num1,num2);
    }
    @GetMapping("/multiply")
    public int sumMultiply(@RequestParam(required = true) int num1,
                        @RequestParam(required = true) int num2){
        return serviceCalc.getRequestMultiply(num1,num2);
    }
    @GetMapping("/divide")
    public int sumDivide(@RequestParam(required = true) int num1,
                        @RequestParam(required = true) int num2){
        if (num1 == 0 || num2 == 0) {
            System.out.println("division by zero");
            return 0;
        }
        return serviceCalc.getRequestDivide(num1,num2);
    }

}

