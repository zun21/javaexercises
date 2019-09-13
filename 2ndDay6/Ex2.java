
/**
 * クラス Ex2 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Ex2
{
    public static void main(String []args){
    int[]numbers = {1,2,3,4,5};
    for(int i=0; i<=4 ; i++){
       if(i==0){
           System.out.print("{" + numbers[i]);
            }else if(i>0){
                System.out.print("," + numbers[i]);
            }
       if(i == 4){
                System.out.print("}");
            } 
    }
}
}
