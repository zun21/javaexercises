import java.util.Scanner;
public class Exercise4{
    public static void main(String[]args){
         Scanner reader = new Scanner(System.in);
         
         System.out.print("Type a number:");
         float number1 = reader.nextFloat();
         
         System.out.print("Type another number:");
         float number2 = reader.nextFloat();
         System.out.print("Division:"+ number1 +"/"+ number2 +"="+ number1/number2);
        }
    }