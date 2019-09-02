package com.lhy.code.factory;


/**
 * @author liuhaiyan
 * @date 2019-09-01 00:51
 */
public class AddCalculator implements Calculator {
    @Override
    public void computer(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("add result is " + result);
    }
}
