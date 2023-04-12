package chapter03.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(20, 5));
        System.out.println(calculator.subtract(20, 5));
        System.out.println(calculator.multiply(20, 5));
        System.out.println(calculator.divide(20, 5));
    }

}
