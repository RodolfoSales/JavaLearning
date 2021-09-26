public class App {
    public static void main(String[] args) throws Exception {
        Human Rick = new Human("Rick",70, 80);
        Human Morty = new Human("Morty", 15, 50);
        Rick.drink();
        Morty.eat();
    }
}
