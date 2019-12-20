import java.util.Scanner;
public class Exercise3{
    public static void main(String[]args){
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a number:");
    int number1 = reader.nextInt();
         
    System.out.print("Type another number:");
    int number2 = reader.nextInt();
    
    System.out.print("Sum of the Number:"+ (number1+number2) );
}
}
