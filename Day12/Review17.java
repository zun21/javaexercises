import java.util.Scanner;
  public class Review17{
      public static void main(String[]args){
          Scanner reader = new Scanner(System.in);
          System.out.println("Calculate the area of a triangle");
          //A = 1/2*h
          double heigh;
          heigh = reader.nextDouble();
          
          double Area;
          Area = (1*heigh)/2;
          System.out.printf("%.2f h is %.2f A",heigh,Area);
        }
    }