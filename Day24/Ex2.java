
/**
 * Write a description of class Ex2 here.
 *
 * @author (Pan Zun)
 * @version (2019/1/16)
 */
public class Ex2
{
    public static double calculateDistance(double x1,double y1, double x2,double y2){
        double a = x2 -x1;
        double b = y2 -y1;
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
    public static void main(String[]args){
        double result = calculateDistance(1,1,4,5);
        System.out.println(result);
}
}
        
        