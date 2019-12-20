
/**
 * Write a description of class Exercise3 here.
 *
 * @author (Pan Zun)
 * @version (2019/01/16)
 */
public class Exercise3
{
    public static boolean isTriangle(int a,int b,int c){
        if(a > b+c && b > a+c && c > a+b){
            return false;
        }else{
            return true;
        }
    }
        public static void main(String[]args){
            boolean result = isTriangle (5,3,2);
            System.out.println(result);
        }
    }
    