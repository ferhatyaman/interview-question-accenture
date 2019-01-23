class Garage {
    private Vehicle vehicle;

    void doPark(Vehicle vehicle) throws Exception {
        if (this.vehicle != null) {
            throw (new Exception("Garage is already full"));
        }
        this.vehicle = vehicle;
    }

    Vehicle unPark() throws Exception {
        if (this.vehicle != null) {
            Vehicle temp = new Vehicle(this.vehicle);
            this.vehicle = null;
            return temp;
        } else
            throw (new Exception("car is not found"));
    }

    Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
