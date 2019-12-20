import java.util.Scanner;
  public class Review13{
      public static void main(String[]args){
          
         final double rateOfPay = 7.50;//per hour
         Scanner reader = new Scanner(System.in);
         Double hourWorked;
         hourWorked = reader.nextDouble();
         Double GrossPay;
         
         GrossPay = rateOfPay*hourWorked;
         System.out.println(hourWorked+ "hr is " + GrossPay+"$");
         
        }
    }

