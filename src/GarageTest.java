import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GarageTest {
    private Garage garage = new Garage();

    @BeforeEach
    void setup() {

    }

    @Test
    void doPark() throws Exception {
        Car car = new Car();
        garage.doPark(car);
        Assertions.assertEquals(car, garage.getVehicle());
    }

    @Test
    void unPark() throws Exception {
        Car car = new Car();
        garage.doPark(car);
        garage.unPark();
        Assertions.assertNull(garage.getVehicle());
    }
}