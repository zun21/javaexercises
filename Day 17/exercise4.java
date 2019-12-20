import java.util.Scanner;
public class exercise4{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int grade1;
        grade1 = reader.nextInt();
        int grade2;
        grade2 = reader.nextInt();
        int grade3;
        grade3 = reader.nextInt();
        int average = (grade1 + grade2 + grade3)/3;
        System.out.println(average);
        if(grade3 > average){
            System.out.println("Your score is greater than the average score");
        }else if(grade3 == 0){
            System.out.println("Your score is the average");
        }else{
            System.out.println("Your score is less than the average score");
            }
        }
}
