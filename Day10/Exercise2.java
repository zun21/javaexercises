import java.util.Scanner;
public class Exercise2{
public static void main(String[]args){
//declare your variables
String name,item1,item2;
int hour,minute;
Scanner reader = new Scanner(System.in);

//input name
System.out.println("What is your name?");
 name = reader.nextLine();
//input item1
System.out.println("What was lunch item1?");
item1 = reader.nextLine();

//input item2
System.out.println("What was lunch item2?");
item2 = reader.nextLine();
 //input hour
System.out.println("What hour did you have lunch?");
hour = reader.nextInt();

//input minute
System.out.println("What minute did you have lunch?");
minute = reader.nextInt();
System.out.printf("%s had %s and %s at %d : %d",name,item1,item2,hour,minute);
}
}