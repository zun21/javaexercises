
/**
 * Write a description of class Exercise4 here.
 *
 * @author (Pan Zun)
 * @version (2018/12/12)
 */
public class Exercise4
{
    public static void fermatLastTheorem(int a,int b,int c,int n){
        if(n>2 && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))){
              System.out.println("Holy smokes,Fermat was Wrong!");
           }else{
           System.out.println("No,that doesn't Work");   
           }
        }
        public static void main(String[]args){
        fermatLastTheorem(1,2,3,4);
        fermatLastTheorem(2,3,4,5);

}
}