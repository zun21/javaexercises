
/**
 * クラス Ex32 の注釈をここに書きます.
 * 
 * @author (PZ)
 * @version (2019/06/14)
 */
public class Ex32
{
   public static void main(String args[]){
       for(int i=1; i<=3; i++){
       for(int j=0; j<=3; j++){
           if(i<=j){
           System.out.print("*");
           }else if(i>j){
           System.out.print(" ");
           }
       }
           System.out.println();
       }
   }
}

    
