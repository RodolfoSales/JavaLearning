public class App {
    public static void main(String[] args) throws Exception {
        // abstract =  abstract classes cannot be instantiated, but they can have a subclass
        //             abstraact methods are declared without an implementation
        //             it adds a layer of security in your code

        //Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();
    }
}
