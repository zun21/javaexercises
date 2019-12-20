import java.util.Scanner;
public class myDetails{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("Your name is "+name);
        int age = reader.nextInt();
        System.out.println("You are"+ age);
    }
}