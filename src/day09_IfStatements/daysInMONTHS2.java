package day09_IfStatements;

import sample.Main;

public class daysInMONTHS2 {

    public static void main(String[] args) {

       int month = 3;
       boolean has28Days = month == 2;
       boolean has30Days = month ==4 || month == 6 || month == 9 || month == 11;



       if (month ==2 ) {
           System.out.println("28 days");
       }else if(has30Days) {
           System.out.println("30 days");

       }else {
           System.out.println("31 days");

       }







    }





}
