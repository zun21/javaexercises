import java.util.Scanner;
  public class Review16{
      public static void main(String[]args){
          Scanner reader = new Scanner(System.in);
          System.out.println("Calculate the equivalent Celcius value");
          
          double Fahrenheit;
           Fahrenheit= reader.nextDouble();
          
          double Celcius;
          Celcius =(Fahrenheit-32)/9*5;
          System.out.printf("%.0f F is %.1f C",Fahrenheit,Celcius);
        }
    }          