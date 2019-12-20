
/**
 * Write a description of class Exercise2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise2
{
    public static void go(int n){
        if(n==4){
            System.out.println("GO!");
        }else{
            System.out.println(n);
            go(n+1);
        }
    }
        public static void main(String[]args){
            go(1);
        }
    }