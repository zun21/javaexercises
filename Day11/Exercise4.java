import java.util.Scanner;
public class Exercise4{
  public static void main(String[]args){
    int number;
    Scanner reader = new Scanner(System.in);
    
    number = reader.nextInt();
    System.out.println( number % 100);
  }
}
