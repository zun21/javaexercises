
/**
 * クラス Warmup3 の注釈をここに書きます.
 * 
 * @author (PZ)
 * @version (2019/06/21)
 */
import java.util.Arrays;
public class Warmup1
{
     public static void main(String[] args){

    double[] tempForecast = {26.0,24.5,22.3};

    double[] tempForecastCopy = new double[tempForecast.length];

        for(int i = 0; i < tempForecast.length; i++){

            tempForecastCopy[i] = tempForecast[i];

            System.out.println(tempForecastCopy[i]);

        }

    }

}



