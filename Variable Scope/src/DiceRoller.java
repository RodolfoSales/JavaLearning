import java.util.Random;

//public class DiceRoller {
//    
//    DiceRoller() {
//        Random random = new Random();
//        int number = 0;
//        roll(random,  number);
//    }
//
//    void roll(Random random, int number) {
//        number = random.nextInt(6)+1;
//        System.out.println(number);
//
//    }
//}

public class DiceRoller {
    Random random = new Random();
    int number = 0;
    
    DiceRoller() {
        roll();
    }

    void roll() {
        this.number = this.random.nextInt(6)+1;
        System.out.println(this.number);

    }
}
