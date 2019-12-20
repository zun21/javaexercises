
/**
 * Write a description of class Exertcise2 here.
 *
 * @author (Pan Zun)
 * @version (2019/1/16)
 */
public class Exertcise2
{
    public static boolean isDivisible(int n,int m){
        if(n%m == 0){
            return true;
        }else{
            return false;
        }
    }
        public static void main(String[]args){
            boolean result = isDivisible (3,2);
            System.out.println(result);
        }
    }
    