
/**
 * クラス Ex36 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Ex36
{
   public static void main(String[]args){
     double[]grades = {22.5,18.2,5.0};
     print(grades);
   }
   public static void print(double[]grades){
       for(double grade:grades){
           System.out.print(grade+" ");
        }
   }
}