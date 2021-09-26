import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //polymorphism = many shaps/forms
        //dynamic = after compilation (during runtime)
        //ex. A corvette is a: corvette, and a car, and a vehicle, and an object
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("what animal do you want?");
        System.out.println("(1=Dog) or (2=cat)");
        int choice = scanner.nextInt();
        scanner.close();
        
        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal=new Cat();
            animal.speak();
        }
        else{
            animal=new Animal();
            System.out.println("invalid choice");
            animal.speak();
        }


    }
}
