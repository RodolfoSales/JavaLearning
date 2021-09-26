public class App {
    public static void main(String[] args) throws Exception {
        //polymorphism =  greek word for poly-many, morph-form
        //                the ability of an object to identify as more than one data type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat =  new Boat();

        Vehicle[] racers = {car,bicycle,boat};
        for (Vehicle vehicle : racers) {
            vehicle.go();
        }

    }
}
