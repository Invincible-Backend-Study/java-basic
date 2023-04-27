package org.example;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public static MyInteger valueOf(int value) {
        return new MyInteger(value);
    }

    public static MyInteger valueOf(Integer value) {
        return new MyInteger(value.intValue());
    }

    public static int unbox(MyInteger myInteger) {
        return myInteger.intValue();
    }
}