import java.util.Scanner;
import java.util.Random;
public class Exercise4{
    public static void main(String[]args){
        System.out.println("I'm thinking of a number between 1 and 100 \n (including both ).Can you guess what it is?");
        
        Scanner reader = new Scanner (System.in);
        
        
        int userInputNumber;
        userInputNumber = reader.nextInt();
        System.out.println("Type a number:" + userInputNumber);
        System.out.println("your guess is:" + userInputNumber);
        
        //Pick a random number
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println("The number I was thinking of is:" + number);
        System.out.println("You were off by:" + (userInputNumber-number));
        
    }
}
        