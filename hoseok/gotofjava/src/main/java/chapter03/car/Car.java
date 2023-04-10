package chapter03.car;

public class Car {

    private int speed;
    private int distance;
    private String color;

    public Car() {

    }

    public void speedUp() {
        speed += 5;
    }

    public void breakDown() {
        speed -= 10;
    }

    public int getCurrentSpeed() {
        return speed;
    }

}
