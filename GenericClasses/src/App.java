public class App {
    public static void main(String[] args) throws Exception {
        //MyIntegerClass myInt = new MyIntegerClass(1);
        //MyDoubleClass myDouble = new MyDoubleClass(3.14);
        //MyCharacterClass myChar = new MyCharacterClass('@');
        //MyStringClass myString = new MyStringClass("Hello");
        Generic_example<Integer> myInt = new Generic_example<>(1);
        //Generic_example<Integer,Integer> myInt = new Generic_example<>(1,9);
        Generic_example<Double> myDouble = new Generic_example<>(3.14);
        Generic_example<Character> myChar = new Generic_example<>('@');
        Generic_example<String> myString = new Generic_example<>("Hello");


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue()); 
    }
}
