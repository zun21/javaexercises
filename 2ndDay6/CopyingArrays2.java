
/**
 * クラス CopyingArrays2 の注釈をここに書きます.
 * 
 * @author (PZ)
 * @version (2019/06/14)
 */
import java.util.Arrays;
   public class CopyingArrays2
{
    public static void grades(String[]args){
        double[]grades = {98.2,22.9,3.0};
        double[]scores = Arrays.copyOf(grades,3);
        System.out.print(Arrays.toString(scores));
    }
}
    