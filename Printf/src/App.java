
public class App {
    public static void main(String[] args) throws Exception {
        //printf() =  and optional method to control, format, and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //             % [flags] [precision] [width] [conversion-character]
        boolean myboolean = true;
        char mychar = '@';
        String mystring = "Rodolfo";
        int myint = 50;
        double mydouble = 1000;

        //System.out.printf("This is a format string %b \n", myboolean);
        //System.out.printf("This is a format string %c \n", mychar);
        //System.out.printf("This is a format string %s \n", mystring);
        //System.out.printf("This is a format string %d \n", myint);
        //System.out.printf("This is a format string %f \n", mydouble);

        //[width]
        //minimum number of characters to be written as output
        System.out.printf("Hello %10s", mystring);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        // System.out.printf("You have this much money %.2f",mydouble);

        //[flags]
        //adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if number>1000
        System.out.printf("You have this much money %,f",mydouble);

    }
}
