
/**
 * クラス Ex7の注釈をここに書きます.
 * 
 * @author (Pan Zun)
 * @version (2019/5/10)
 */
public class Ex7
{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=1;j--){
                if(j == i || j+i == 6){
                    System.out.print("*");
                }else if( j != i || j+i != 6){
                    System.out.print(" ");
                }
            }
            System.out.println();
        
    }
}
}
