import java.util.Scanner;
public class Exercise3{
public static void main(String[]args){
    final double CM_IN_INCH = 2.54;
    //cm＝inches*2.54
    Scanner reader = new Scanner (System.in);
    String name;
    double numberInInches;
    
    System.out.println("What number in cm do you want to Convert?");
    numberInInches = reader.nextDouble();
    reader.nextLine();
    System.out.println("What is your name?");
    name = reader.nextLine();
    
    System.out.printf("%s, %.0f inches is %.2f cm",name,numberInInches,numberInInches*CM_IN_INCH);
}
}
