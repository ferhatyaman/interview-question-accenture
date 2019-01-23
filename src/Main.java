public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck();
        System.out.println(truck.getWheels());

        Garage garage = new Garage();
        try {
            garage.doPark(truck);
            System.out.println(garage.unPark().getWheels());

            Bicycle bicycle = new Bicycle();
            garage.doPark(bicycle);
            garage.doPark(truck);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

