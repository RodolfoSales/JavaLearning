public class App {
    public static void main(String[] args) throws Exception {
        //static = modifier. A single copy of a variable/method is created and shared.
        //         The class "owns" the static member
        Friend friend1 =  new Friend("rod");
        Friend friend2 =  new Friend("rod2");
        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    
    }
}
