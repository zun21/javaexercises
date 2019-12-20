import java.util.Scanner;
public class Exercise2{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        //ask for a float number in Cm
        //Save user input in variable called numberInCm
        //Create constant CM_IN_INCH
        float number = reader.nextFloat();
        final double CM_IN_INCH = 2.54;
        System.out.printf(number + "is" + "%.2f inches",number*CM_IN_INCH);
               
    }
}