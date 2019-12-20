
/**
 * Write a description of class Exercise6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


    public class Ex6Buzz{
        public static void baffle(String blimp){
            System.out.println(blimp);
            zippo("ping",1);
        }
        public static void zippo(String quince, int flag){
            if(flag < 2){
                System.out.println(quince + "zoop");
            }else{
                System.out.println("ik");
                baffle(quince);
                System.out.println("boo-wa-ha-ha");
            }
        }
        public static void main(String[]args){
            zippo("rattle",13);
        }
    }

    