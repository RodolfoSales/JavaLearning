public class App {
    public static void main(String[] args) throws Exception {
        //bounded types = you can create the object of a generic class to have data of specific derived types ex. Number

        Generic_example<Integer,Integer> myInt = new Generic_example<>(1,9);

        System.out.println(myInt.getValue());
        
    }
}
