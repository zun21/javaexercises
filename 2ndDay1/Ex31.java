
/**
 * 2J Ex31 の注釈をここに書きます.
 * 
 * @author (PanZun)
 * @version (31/5/2019)
 */
public class Ex31
{
    public static void main(String[]args){
        for (int i = 0; i <= 2 ; i++ ){
           for (int j = 0; j <= 2 ; j++ ){
             if( i+j == 2 || i+j == 3 || i+j == 4 ){
                System.out.print("*");
            }else if( i+j == 0 || i+j == 1){
             System.out.print(" ");
            }
           }
           System.out.println( );
        }
    }
}
