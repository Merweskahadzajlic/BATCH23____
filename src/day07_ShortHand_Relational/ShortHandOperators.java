package day07_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        String name1 = "Muhtar";
        String name2 = "Mehmet";

        String name3 = name2 ;

        name2 = name1; // name2 = "Muhtar"

        name1 = name2; // name1 = "Mehmet"

        System.out.println("name1 ="+ name1);
        System.out.println( "name2 = " + name2 );


        System.out.println("-----------------------------");

        int a = 200 ;
        System.out.println("a = " + a); //200

        a= 100 + 300;

        System.out.println("a = " +a); // 400


        System.out.println("--------------------------");

        int balance = 300;
       // balance  = balance + 200 ;
      balance += 200;

        System.out.println( "balance =" + balance );//500

        balance += 1000;
        System.out.println("balance =" + balance); //1500

        String school= "Cybertek";

        System.out.println("school= "+school);

        String name = "John";
        String lastname = "Daniel";

        name += " ";
        name += lastname;

        System.out.println( "name = "+ name );
        System.out.println( "lastname = "+ lastname );

        System.out.println("---------------------");


        balance += 300;
        System.out.println("balance = "+ balance );

       balance -= 1000;
        System.out.println("balanace = "+ balance);

        System.out.println("------------------------");

        // *=
        double salary = 100000;
        //salary = salary * 2;

        salary *= 2 ;

        System.out.println("salary =$" +salary);

        salary *= 1.5 ;

        System.out.println("salary =$" + salary );

        //0.65
        salary *= 0.65;

        System.out.println("salary ="+salary);

        System.out.println("----------------------------------");

        //    /=
        double slices = 10 ; //10.0

        slices/= 3;

        System.out.println("slices ="+ slices);

        // System.out.println(10/0);

        System.out.println("---------------------------------");

        // %=

        int cents = 10 ;
        int quarters = cents / 25 ;

        System.out.println("quarters =" +quarters);

        System.out.println("cents =" +cents);

        /*
        remainder = numarator - (denominator * whole number of division result )


       10/3 ====> 3,333333

       remainder = 10- (3 * 3) = 1

       */



































    }








}
