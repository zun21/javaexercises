public class LOgicalOperators{
    public static void main(String[]args){
     boolean x = false;
     boolean y = true;
     boolean z = true;
     System.out.println( y );
     System.out.println( y && z );
     System.out.println( x || y );
     System.out.println( x && y || ! z );
     System.out.println( ! x|| y );
     System.out.println(!( x || y ));
     System.out.println( !(x && y ) );
     System.out.println( ! x || !y );
     System.out.println(!(x||y));
     System.out.println(!x && !y);
     int a = 4;
     int b = 6;
     System.out.println( !(a<5 && b==3 ) );
     System.out.println(a>=5 || b!=3);
     System.out.println(!( a>=1 || b!=7 ) );
     System.out.println( a<1 && b==7 );
     }
}