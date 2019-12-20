import java.util.Scanner;
public class Exercise3{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        //"5000seconds = 1hours,23minutes and 20seconds
        int seconds = reader.nextInt();
        int secondsToHour = seconds/3600;//hour
        int secondsToMinute = (seconds%3600)/60;//minute
        int secondsToSeconds = (seconds)%60;//seconds
        
        System.out.printf("%ds is %dh,%dm and %ds.",seconds,secondsToHour,secondsToMinute,secondsToSeconds);
        
        
    }
}
        
        