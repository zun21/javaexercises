import java.util.Scanner;
public class Exercise3{
    //Main Method
   public static void main(String[]args){
       Scanner reader = new Scanner(System.in);
       int number = reader.nextInt();
       signMethod(number);
    }
    //sign method
   public static void signMethod(int number){
       //display the Sign
   if(number>0){
       System.out.println("Sign is +1");
    }else if(number==0){
        System.out.println("Sign is 0");
    }else{
        System.out.println("Sign is -1");
    }
}
}
 