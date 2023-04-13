package C03;

public class Car {
    int speed;
    int distance;
    String color;

    public Car() {
    }
    public void speedUp() {
        speed += 5;
    }
    public void speedDown() {
        speed -= 10;
    }

    public int getCurrentSpeed() {
        return speed;
    }
}
