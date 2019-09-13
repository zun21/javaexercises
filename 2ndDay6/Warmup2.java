
/**
 * クラス Warmup2 の注釈をここに書きます.
 * 
 * @author (PZ)
 * @version (2019/06/21)
 */
import java.util.Arrays;
public class Warmup2
{
    public static void main(String[]args){
        double[]tempForecast = {26.0,24.5,22.3};
        double[]tempForecastCopy = Arrays.copyOf(tempForecast,2);
        System.out.print(Arrays.toString(tempForecastCopy));
    }
}
    