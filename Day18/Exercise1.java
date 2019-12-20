import java.util.Scanner;
   //Main Method
public class Exercise1{
    public static void main(String[]args){
        evenOrOdd();
        }
        //Odd or Even Number
    public static void evenOrOdd(){
        //Obtain a number
        Scanner reader = new Scanner(System.in);
        int number;
        number = reader.nextInt();
        //Find anumber Odd Or Even
        int OddOrEvenNumber = number %2;
        
    
    //display is anumber is even or odd
    if(OddOrEvenNumber==0){
        System.out.println("the number is even number");
    }else{
        System.out.println("the number is odd number");
    }
}
}
    
    
    