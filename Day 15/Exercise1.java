import java.util.Scanner;
public class Exercise1{
    public static void calculateGrossPay(int hoursWorked,int rateOfPay){
        
        System.out.printf("Grosspay = %d yen",hoursWorked*rateOfPay);
    }
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int hoursWorked = reader.nextInt();
        int rateOfPay = reader.nextInt();
        
        calculateGrossPay(hoursWorked,rateOfPay);
    }
}
