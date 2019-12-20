
/**
 * Write a description of class Ex1 here.
 *
 * @author (Pan Zun)
 * @version (2019/1/16)
 */
import java.util.Scanner;
public class Ex1
{
   
   public static boolean singleDigit(int num){
       if(-10<num && num<10){
           return true;
        }else{
            return false;
        }
    }

        public static void main(String[]args){
            Scanner reader = new Scanner(System.in);
            int num;
            num = reader.nextInt();
            boolean result = singleDigit(num);
            System.out.println(result);
        }
    }
