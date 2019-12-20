public class BooleanDatatype{
    public static void main(String[]args){
     boolean a = true;
     boolean b = false;
     boolean c = true;
     boolean d = false;
     System.out.println( a&&b );
     System.out.println( a&&c );
     System.out.println( b&&a );
     System.out.println( b&&d );
     System.out.println( a||b);
     System.out.println( a||c );
     System.out.println( b||a );
     System.out.println( b||d );
     boolean w = false;
     boolean x = true;
     boolean y = false;
     boolean z =true;
     System.out.println( w&&y );
     System.out.println( w||y);
     System.out.println( w&&x );
     System.out.println( w||x);
     System.out.println( z&&y );
     System.out.println( z||y);
     System.out.println( z&&x );
     System.out.println( z||x);
     System.out.println( !w );
     System.out.println( !x );
    }
}