import java.util.Scanner;
public class Exercise2{
   //Main Method
   public static void main(String[]args){
       largerThan();
    }
    public static void largerThan(){
        Scanner reader = new Scanner(System.in);
        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        //Display the larger of two numbers
        if(number1>number2){
            System.out.println("number1 is larger than number2");
        }else if(number1==number2){
            System.out.println("number1 is equal number2");
        }else{
            System.out.println("number2 is larger than number 1zz");
        }
    }
}