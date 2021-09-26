import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public class App {
    public static void main(String[] args) throws Exception {
        //String[] animals = {"cat","dog","bird"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        for (String i : animals) {
            if (i=="cat") {
                System.out.println(i+"y");
            } else if(i=="dog"){
                System.out.println(i+"o");                
            }
            else{
                System.out.println(i);
            }
            
        }
    }
}
