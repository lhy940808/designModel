package com.lhy.code;

import sun.java2d.pipe.SpanShapeRenderer;

/**
 * @author liuhaiyan
 * 问题描述：实现一个计算器控制台程序，要求输入两个数和运算符号，得到结果
 * @date 2019-09-01 00:41
 */
public class SimpleFactory {

    String op;
    public SimpleFactory(String op) {
        this.op = op;
    }

    public  Calculator getCalculator() {
        Calculator result = null;
        switch (op) {
            case "add":
                result = new AddCalculator();
                break;
            case "sub" :
                result = new SubCalculator();
                break;
            default:
                break;

        }
        return result;

    }
}
