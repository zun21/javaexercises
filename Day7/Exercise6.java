import java.util.Scanner;
public class Exercise6{
    public static void main(String[]args){
        String name;
        String city;
        String country;
        int age;
        Scanner reader=new Scanner(System.in);
        System.out.println("What is your name?");
        name=reader.nextLine();
        System.out.println("Your name is"+ name);
        
        System.out.println("What city are you from?");
        System.out.println("What Country are you from?");
        city=reader.nextLine();
        country=reader.nextLine();        
        System.out.println("Your from" city " in "  country);


        System.out.println("How old are you?");
        name=reader.nextLine();
        System.out.println("You are" + age" years old");
        
    }
}