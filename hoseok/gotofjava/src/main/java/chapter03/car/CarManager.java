package chapter03.car;

public class CarManager {

    public static void main(String[] args) {
        Car ferrari = new Car();
        Car porsche = new Car();

        porsche.speedUp();
        porsche.speedUp();
        System.out.println(porsche.getCurrentSpeed());
        porsche.breakDown();
        System.out.println(porsche.getCurrentSpeed());
    }
    
}
