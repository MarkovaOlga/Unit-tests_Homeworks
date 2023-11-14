package test;

import homework2.Car;
import homework2.Motorcycle;
import homework2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("Mazda","3", 2015);
        motorcycle = new Motorcycle("Honda", "CB400", 2018);
    }
    @Test
    void carIsInstanceOfVehicle(){
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    @Test
    void carHasFourWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    void motorcycleHasTwoWheels(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    @Test
    void carHasTestDriveSpeedSixty(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleHasTestDriveSpeedSeventyFive(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    @Test
    void carStopAfterPark(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleStopAfterPark(){
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
