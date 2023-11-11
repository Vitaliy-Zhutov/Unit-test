package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void BeforeEach() {
        car = new Car("Lada", "Granta", 2023);
        motorcycle = new Motorcycle("BMW", "R 1300 GS", 2023);
    }

    // Тест-1, проверяем что Car является экземпляром транспортного средства, через - instanceof
    @Test
    void isTheCarAvehicle() {
        assertTrue(car instanceof Vehicle);
    }

    // Тест-2, проверяем, что Car создается с 4-мя колесами
    @Test
    void theCarHasFourWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    // Тест-3, проверяем, что Motorcycle создается с 2-мя колесами
    @Test
    void TheMotorcycleHasTwoWheels() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    // Тест-4, проверяем, что Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void TheCarDevelopsSpeedOf60() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    // Тест-5, проверяем, что Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void TheMotorcycleDevelopsSpeedOf75() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    // Тест-6, проверяем, что в режиме парковки
    // сначала testDrive, потом park, т.е эмуляция движения транспорта, машина останавливается (speed = 0)
    @Test
    void checkTestDriveFirstThenParkCar() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    // Тест-7, проверяем, что в режиме парковки
    // сначала testDrive, потом park, т.е эмуляция движения транспорта, мотоцикл останавливается (speed = 0)
    @Test
    void checkTestDriveFirstThenParkMotorcycle() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }

}