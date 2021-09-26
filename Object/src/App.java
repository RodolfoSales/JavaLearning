public class App {
    public static void main(String[] args) throws Exception {
        // object = an instance of a class that may contain atributes(features that the object has) and methods(things that the object can do, in other words it means actions)
        // example: (phone, desk, computer, coffee cup)
        // OOP = oriented object programming
        Car myCar = new Car();
        Car myCar2 =  new Car();

        System.out.println(myCar.model);
        myCar.drive();

        System.out.println(myCar2.model);
        myCar2.drive();


    }
}
