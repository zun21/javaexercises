import java.util.Scanner;

public class InchesToCentimeters
{
    public static void main(String[]args){
        
        //declare the variables
        int inch;
        double cm;
        //create a scanner variable called in that input from System.in
        Scanner in = new Scanner(System.in);
        
        //Prompt the user for the input
        System.out.print("How many inches?");
        //use scanner method nextInt which reads input from the ketboard and converts it to integer
        inch = in.nextInt();
        
        //multiply number of inches by 2.54
        cm = inch * 2.54;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm ");
    }
}