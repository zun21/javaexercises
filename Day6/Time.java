public class Time{
    public static void main(String[] args){
    int hour = 15;
    int minute = 10;
    int second = 0;
    //Numbers of Seconds Since Midnight
    //one hour in seconds
    int oneHourInSeconds = 3600;
    int tenMinuteInSeconds = 600;
    int secondsSinceMidnight = hour*oneHourInSeconds+tenMinuteInSeconds;
    System.out.println(secondsSinceMidnight);
   //Numbers of Seconds Remaining in the day 
    int adayInSeconds = 86400;
    int remainingAdayInSeconds = adayInSeconds-secondsSinceMidnight;
    System.out.println(remainingAdayInSeconds);
    //Current Hour in Percentage (15hr)
   int hourInaday = 24;
   int percentageInaday = 100;
   //15/24*100
   double currenthourInPercentage = (double) hour/hourInaday*percentageInaday;
   System.out.println(currenthourInPercentage+"%");
   }
}
    
    
