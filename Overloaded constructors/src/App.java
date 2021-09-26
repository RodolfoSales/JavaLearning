public class App {
    public static void main(String[] args) throws Exception {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("1");
        Pizza pizza3 = new Pizza("1","2");
        Pizza pizza4 = new Pizza("1","2","3");
        Pizza pizza5 = new Pizza("1","2","3","4");
    
        System.out.println(pizza1.bread); 
    }
}
