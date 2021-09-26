public class App {
    public static void main(String[] args) throws Exception {
        //generics = enables types (classes and itnerfaces) to be parameters when defining
        //           classes, interfaces and methods
        //           a benefit is to eliminate the need to create multiple versions
        //           of methods or classes for various data types
        //           Use 1 version for all reference data types

        Integer[] intArray = {1,2};
        Double[] doubleArray = {1.0,2.0};
        String[] stringArray = {"1","2"};
        Character[] charArray = {'1','2'};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(stringArray);
        displayArray(charArray);

    }

    public static <Thing> void displayArray(Thing[] array){
        for (Thing thing : array) {
            System.out.print(thing+" ");
        }
        System.out.println();
    }

    public static <Thing> Thing getfirst(Thing[] array){
        return array[0];
    }
}
