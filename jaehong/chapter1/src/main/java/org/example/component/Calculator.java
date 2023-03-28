package org.example.component;

public class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int addAll(int num1, int num2, int num3){
        return add(add(num1, num2) , num3);
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int divide(int num1, int num2){
        return num1 / num2;
    }
}
