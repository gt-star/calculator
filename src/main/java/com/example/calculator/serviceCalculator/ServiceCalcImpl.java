package com.example.calculator.serviceCalculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalcImpl implements ServiceCalc{
    private int a;
    private int b;

    @Override
    public int getRequestPlus(int a, int b) {
        return a+b;
    }

    @Override
    public int getRequestMinus(int a, int b) {
        return a-b;
    }

    @Override
    public int getRequestMultiply(int a, int b) {
        return a*b;
    }

    @Override
    public int getRequestDivide(int a, int b) {

        return a/b;
    }
}
