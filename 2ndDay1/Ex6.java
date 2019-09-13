
/**
 * クラス Ex6 の注釈をここに書きます.
 * 
 * @author (Pan Zun)
 * @version (2019/5/10)
 */
public class Ex6
{
   public static void main(String[]args){
       for(int i=0;i<=3;i++){
           for(int j=3; j>=0;j--){
               if(j==i){
                   System.out.print("*");
            }else if(j!=i){
                System.out.print(" ");
        }
    }System.out.println();
}
}
}

