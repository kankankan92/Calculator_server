package com.company;

public class Calculator {

    public static int calculator(String expression) {
        int c = 0;
        if (expression.contains("-")) {
            String values[] = expression.split("-");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            c = a - b;
        } else if (expression.contains("/")) {
            String values[] = expression.split("/");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            c = a / b;
        } else if (expression.contains("*")) {
            String values[] = expression.split("\\*");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            c = a * b;
        } else if (expression.contains("+")) {
            String values[] = expression.split("\\+");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            c = a + b;
        }
        return c;
    }
}
