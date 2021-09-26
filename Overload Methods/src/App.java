public class App {
    public static void main(String[] args) throws Exception {
        //Overloaded methods = methods that share the same name but have different parameters
        //                     Method name + parameters= method signature
        int x = add(1,2);

        System.out.println(x);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
}
