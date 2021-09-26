import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();
        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();
        
        try{
            int z = x/y;        
            System.out.println("result: "+z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero! IDIOT!");
        }
        catch(InputMismatchException e){
            System.out.println("Enter a number");
        }
        catch(Exception e){
            System.out.println("Something went wrong");//user Exception e just as last resort, try to handle which one individually        
        }
        finally{
            System.out.println("This will always print"); // use this block to close scanners or files
            scanner.close();
        }
        
    }
}
