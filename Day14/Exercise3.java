public class Exercise3{
    public static void firstName(){
        System.out.print("Pan");
    }
    public static void lastName(){
        System.out.println(" Zun");
    }
    public static void fullName(){
        firstName();
        lastName();
    }
    public static void main(String[]args){
        fullName();
    }
}