
/**
 * Write a description of class Exercise here.
 *
 * @author (Pan Zun)
 * @version (2018/12/19)
 */

    public class Chapter5{
    public static void binaryNumber(int num){
        if ( num > 0 ){
          System.out.println(num%2);
          int result = num/2;
          binaryNumber(result);
      }
    }
        
        public static void main(String[]args){
            
            binaryNumber(23);
        }
    }


