public class Vehicle {
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    Vehicle() {
    }

    Vehicle(Vehicle clone) {
        this.setWheels(clone.getWheels());
    }

    int getWheels() {
        return wheels;
    }

    void setWheels(int wheels) {
        this.wheels = wheels;
    }

}

