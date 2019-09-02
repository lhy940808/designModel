package com.lhy.code.factory;

import com.lhy.code.factory.Calculator;

/**
 * @author liuhaiyan
 * @date 2019-09-01 00:53
 */
public class SubCalculator implements Calculator {
    @Override
    public void computer(int number1, int number2) {
        int result = number2 - number1;
        System.out.println("sub result is : " + result);
    }
}
