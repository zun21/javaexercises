import java.util.Scanner;
public class Exercise1{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int numberOfDaysLeft;
        numberOfDaysLeft = reader.nextInt();
        
        boolean dayBeforeAssignmentDue = false;
        if(numberOfDaysLeft<=1){
          dayBeforeAssignmentDue = true;
        }
        if(dayBeforeAssignmentDue){
            System.out.println("Hurry Hurry!!");
        }else{
            System.out.println("It's OK");
        }
    }
}
        
  