package com.example.calculator.serviceCalculator;

import com.example.calculator.Exception.DivisionByZeroException;
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
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a/b;
    }
}
