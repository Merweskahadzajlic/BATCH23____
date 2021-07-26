package day07_ShortHand_Relational;

public class FreeShipping {

    public static void main(String[] args) {

        double price = 15 ; // >25

        boolean isPrimeMember = false ;

        boolean isElligibleForFreeShipping = price >= 25  || isPrimeMember == true;

        //                                   15 >= 25      || true == true
        //                                     false       || true
        //                                     true

        System.out.println("is Elligible For Free Shipping: "+isElligibleForFreeShipping);





    }







}
