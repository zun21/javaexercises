import java.util.Scanner;
public class Exercise4{
public static void main(String[]args){
    final double inchtofeet = 12;
    //12inchs = 1ft
    Scanner reader = new Scanner (System.in);
    double numberInInches;
    numberInInches = reader.nextDouble();
    System.out.printf(" %.0f inches is %.2f feets",numberInInches,numberInInches/inchtofeet);
}
}
    