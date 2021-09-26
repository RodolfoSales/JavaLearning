public class App {
    public static void main(String[] args) throws Exception {
        Food food1 =  new Food("pizza");
        Food food2 = new Food("Hamburger");
        Food food3 =  new Food("hotdog");

        Food[] refrigerator = {food1, food2, food3};

        //System.out.println(refrigerator[0].name);
        //System.out.println(refrigerator[1].name);
        //System.out.println(refrigerator[2].name);
        System.out.println(refrigerator[0]);
    }
}
