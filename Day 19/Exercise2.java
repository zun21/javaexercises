import java.util.Scanner;
public class Exercise2{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        boolean evenflag = false;
        if(number %2 == 0){
            evenflag = true;
        }
        if(evenflag){
            System.out.println("a even number");
        }else{
            System.out.println("not a even number");   
    }
}
}