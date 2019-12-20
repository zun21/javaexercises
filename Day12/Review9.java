public class Review9{
    public static void main (String[]args){
    //Calculate fuel consumption as
    //litres per 100 kilometres travelled
    //All calculate involve doubles.
    double litres,Km,Km100;
    
    litres = 60.6;
    Km = 500.25;
    Km100 = Km/100.0;
    //Calculate litres per 100km
    double comsumption = litres/Km100;
    
    System.out.println(comsumption);
    }
}