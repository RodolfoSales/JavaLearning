import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("pasta");
        drinksList.add("garlic bread");

        groceryList.add(bakeryList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
    }
}
