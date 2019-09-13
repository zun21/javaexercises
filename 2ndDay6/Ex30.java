
/**
 * クラス Ex30 の注釈をここに書きます.
 * 
 * @author (PZ)
 * @version (2019/6/28)
 */
public class Ex30
{
    public static void main (String[]args){
        int[]numberList = {1,2,3,4,5};
        int number = 5;
        search(numberList,number);
    }
    public static int search(int[]a,int number){
        for(int i=0;i<a.length;i++){
            if(a[i] == number){
                System.out.print("find the value"+a[i]);
                return 1;
            }
        }
        return -1;
      }
}
