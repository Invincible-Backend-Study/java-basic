package chapter04;

public class Variable {
    private double instanceVariable;
    private static int classVariable;

    public void method(int parameter) {
        int localVariable;
    }

    public static void main(String[] args) {
        Variable variable = new Variable();
        variable.method(7);
        {
            int a = 10;
        }
        {
            int a = 20;
        }
        System.out.println(classVariable);
    }
}
