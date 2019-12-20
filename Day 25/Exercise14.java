/**
 * Write a description of class Exercise13 here.
 *
 * @author (P.Z)
 * @version (2019/01/22)
 */
public class Exercise14
{
    public static void main(String[]args){
        for(int n =0; n <=20; n++){
            System.out.println( n);
            if(n == 12){
                continue;
            }
            System.out.println("next number");
        }
        System.out.println("This is The End!");
    }
}