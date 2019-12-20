
/**
 * Write a description of class Exercise5 from Chaper5(day 21) here.
 *
 * @author (Pan Zun)
 * @version (2018/12/12)
 */
public class Exercise5
{
    public static void lyrics (int n){
        if(n==0){
            System.out.println("No bottles of beer on the wall,no bottles of beer,ya' can't take one down,ya' can't pass it around,cause there are no more bottles of beer on the wall!");
            }else{
             System.out.println(n +" bottles of beer on the wall," + n + " bottles of beer,ya'  take one down,ya' pass it around," + (n-1) + " of beer on the wall!");
             lyrics(n-1);                  
                            }
                        }
    public static void main(String[]args){
        lyrics(99);
    }
                    }