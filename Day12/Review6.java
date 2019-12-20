public class Review6{
    public static void main (String[]args){
     int number,digit;
     number = 1297;
     
     digit = number%10;//digit=7
     System.out.println(digit);
     
     number = number/10;//number=129
     digit = number%10;//digit=9
     System.out.println(digit);
     
     number = number/10;//number=12
     digit = number%10;//digit=2
     System.out.println(digit);
     
     number = number/10;//number=1     
     digit = number%10;//digit=1
     System.out.println(digit);
    }
}