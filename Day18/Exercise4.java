import java.util.Scanner;
public class Exercise4{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int year = reader.nextInt();
        System.out.println(year);
        if(year%4==0 && year%100 !=0 || year%400 ==0){
        System.out.println("leap year");
        }else{
        System.out.println("not leap year");
    }
}
}
