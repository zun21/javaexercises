import java.util.Scanner;
  public class Review15{
      public static void main(String[]args){
          Scanner reader = new Scanner(System.in);
          System.out.println("Calculate the equivalent Fahrenheit value");
          
          double Celcius;
          Celcius = reader.nextDouble();
          
          double Fahrenheit;
          Fahrenheit = (9*Celcius)/5+32;
          System.out.printf("%.0f C is %.1f F",Celcius,Fahrenheit);
        }
    }          