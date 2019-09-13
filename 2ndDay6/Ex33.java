
/**
 * クラス Ex33 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util.Random;
import java.util.Arrays;
public class Ex33{
  public static void main (String[]args){
      int numValues = 20;
      int[]a = rangeCount(numValues);
      int scores = Range(a,0,5);
      System.out.print(Arrays.toString(a));
      System.out.print(scores);
  }
  public static int[]rangeCount(int size){
      Random random = new Random();
      int[]a = new int[size];
      for(int i = 0 ; i < a.length;i++){
          a[i] = random.nextInt(20);
        }
        return a;
    }
    public static int Range(int[]a,int low,int high){
        int count =0;
        for(int i = 0; i < a.length;i++){
            if(a[i]>= low && a[i] < high){
                count++;
            }
        }
        return count;
    }
}

