import java.util.Scanner;
public class Exercise3{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int age = reader.nextInt();
        boolean ageflag = false;
        if(age > 18){
            ageflag = true;
        }
        if(ageflag){
            System.out.println("You are adult");
        }else{
            System.out.println("You are not adult");   
    }
}
}