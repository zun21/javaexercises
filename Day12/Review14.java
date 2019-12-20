import java.util.Scanner;
  public class Review14{
      public static void main(String[]args){
          
          Scanner reader = new Scanner(System.in);
          double price;
          price = reader.nextDouble();
          
          double pstPayable = price*0.05;
          double gstPayable = price*0.08;
          
          double TotalPrice;
          TotalPrice =price+pstPayable+gstPayable;
          
          System.out.printf("%2f $",TotalPrice);
        }
    }