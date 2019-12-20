
/**
 * Write a description of class Exercise2 here.
 *
 * @author (Pan Zun)
 * @version (2018/12/5)
 */
import java.util.Scanner;
public class Exercise2{
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
            return;
        }
            System.out.println("Go on Vacation");
        
    }
}
        
  