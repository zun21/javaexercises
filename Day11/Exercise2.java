import java.util.Scanner;
public class Exercise2{
  public static void main(String[]args){
    int oddNumber,evenNumber;
    Scanner reader = new Scanner(System.in);
    
    oddNumber = reader.nextInt();
    System.out.println( oddNumber % 2);
    
    evenNumber = reader.nextInt();
    System.out.println( evenNumber % 2);
  }
}
