public class App {
    public static void main(String[] args) throws Exception {
        // method = a block of code that is executed whenever it is called upon
        int x = 3;
        int y = 4;
        int z = add(x,y);

        System.out.println(z);
    }
    static int add(int x, int y) {
        //cannot call a non static method from a static main
        int z = x+y;
        return z;
    }
}
