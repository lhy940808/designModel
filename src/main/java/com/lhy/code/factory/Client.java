package com.lhy.code.factory;

/**
 * @author liuhaiyan
 * @date 2019-09-01 00:57
 */
public class Client {

    public static void main(String[] args) {
        //客户端 使用计算器

        Calculator calculator = new SimpleFactory("add").getCalculator();
        calculator.computer(2, 3);
    }
}
