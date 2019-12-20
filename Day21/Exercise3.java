
/**
 * Write a description of class Exercise3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise3
{
    public static void happynewyear(int n){
        if(n==0){
            System.out.println("Happy New Year!");
        }else{
            System.out.println(n);
            happynewyear(n-1);
        }
    }
        public static void main(String[]args){
            happynewyear(10);
        }
    }