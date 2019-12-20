import java.util.Scanner;
public class Exercise1{
    public static void main(String[]args){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String name  = reader.nextLine();
        
        System.out.println("How many years have you lived in Japan?");
        float numberOfYears = reader.nextFloat();
        
        System.out.println("How many months have you lived in Japan?");
        float numberOfMonths = reader.nextFloat();
        
        System.out.printf(name+",you have lived in Japan for %.1f years",numberOfYears+numberOfMonths/12);
    }
}
        
        