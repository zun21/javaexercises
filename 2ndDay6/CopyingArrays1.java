
/**
 * クラス CopyingArrays の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class CopyingArrays1
{
    public static void main(String[]args){
        double[]scores = new double [3];
        double[]grades = {98.2,22.9,33.0};
        for(int i=0; i <= 2; i++){
            grades[i] = scores[i];
            System.out.print(scores[i]+ " ");
        }
    }
}
