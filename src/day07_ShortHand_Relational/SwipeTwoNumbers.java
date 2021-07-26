package day07_ShortHand_Relational;

public class SwipeTwoNumbers {
    public static void main(String[] args) {


        int a = 200;

        int b = 300;

        int c = a ;


       a = b ; a = 300;

       b = a ; b = 300 ;

        System.out.println("a=" + a); //300
        System.out.println("b= " + b); //200




    }
}