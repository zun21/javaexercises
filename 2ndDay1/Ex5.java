
/**
 * クラス Ex5 の注釈をここに書きます.
 * 
 * @author (Pan Zun)
 * @version (2019/5/10)
 */
public class Ex5
{
  public static void main(String[]args){
      for(int i=1;i<=3;i++){
          for(int j=1; j<=3;j++){
              if(j==i){
              System.out.print("*");
            }else if(j!=i){
                System.out.print(" ");
        }
           
    }
    System.out.println(); 
}
}
}
