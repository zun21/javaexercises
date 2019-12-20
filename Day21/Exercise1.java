
/**
 * Write a description of class Exercise1 from day21 here.
 *
 * @author (Pan Zun)
 * @version (2018/12/12)
 */
public class Exercise1
{
    //Create a method
    public static void happynewyear(int n){
        //countdown gets to 1 print
        if(n==1){
            //print Happy New Year
            System.out.println("Happy New Year!");
        }else{
            //Start the countdown
            System.out.println(n);
            happynewyear(n-1);
        }
    }
    //start the countdown from10
    //Main Method
        public static void main(String[]args){
            happynewyear(10);
        }
    }