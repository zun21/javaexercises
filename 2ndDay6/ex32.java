
/**
 * クラス Ex32 の注釈をここに書きます.
 * 
 * @author (PZ)
 * @version (2019/6/28)
 */
import java.util.Random;import java.util.Arrays;
public class ex32
{
  public static void main(String[]args){
    int numValues = 50;
    int[]a = randomArray(numValues);
    System.out.print(Arrays.toString(a));
  }
  public static int[]randomArray(int size){
      Random random = new Random();
      int[]a = new int[size];
      for(int i=0;i<a.length;i++){
          a[i] = random.nextInt(100);
        }
        return a;
    }
}
    
