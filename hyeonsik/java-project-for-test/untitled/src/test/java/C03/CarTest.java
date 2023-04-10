package C03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car dogCar;
    Car cowCar;

    @BeforeEach
    void before() {
        dogCar = new Car();
        cowCar = new Car();
    }

    @DisplayName("속도 조작 확인")
    @Test
    void speedControl() {
        dogCar.speedUp();
        dogCar.speedUp();
        cowCar.speedUp();
        cowCar.speedDown();

        assertEquals(10, dogCar.getCurrentSpeed());
        assertEquals(-5, cowCar.getCurrentSpeed());
    }
}