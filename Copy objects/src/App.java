public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Chevrolet","Camaro",2021);
        //Car car2 = new Car("Ford","Mustang",2022);

        //car2.copy(car1);
    
        Car car2 = new Car(car1);
    }
}
