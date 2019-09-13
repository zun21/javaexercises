
/**
 * クラス Ex34 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util.Random;
import java.util.Arrays;
public class Ex34{
  public static void main (String[]args){
      int[]scores = rangeCount(100);
      System.out.println(Arrays.toString(scores));
      int[] counts = new int[100];
      for(int i = 0 ; i < counts.length;i++){
          counts[i] = Range(scores,i,i+1);
        }
      System.out.print(Arrays.toString(counts));
      }
  public static int[]rangeCount(int size){
      Random random = new Random();
      int[]a = new int[size];
      for(int i = 0 ; i < a.length;i++){
          a[i] = random.nextInt(100);
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