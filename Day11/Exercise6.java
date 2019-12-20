import java.util.Scanner;
public class Exercise6{
  public static void main(String[]args){
      //24.0C = 75.2F
      double Celsius;
      Scanner reader = new Scanner (System.in);
      Celsius = reader.nextDouble();
      //F=C*9/5+32
      System.out.printf("%.1f C = %.1f F",Celsius,Celsius*9/5+32);
    }
}
      
      
      
      
      
      
