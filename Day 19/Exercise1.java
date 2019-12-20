import java.util.Scanner;
public class Exercise1{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        boolean negativeflag = false;
        if(number<0){
            negativeflag = true;
        }
        if(negativeflag){
            System.out.println("a negative number");
        }else{
            System.out.println("not a negative number");   
    }
}
}