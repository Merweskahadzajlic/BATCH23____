package day13scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class NextMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String firstName = scan.next();


        System.out.println("Enter your last name");
        String lastName = scan.next();
        String fullName = firstName + " " +lastName;

        System.out.println( "fullName = "+ fullName);

        System.out.println("Enter your address");

        String address = scan.next();

        System.out.println("address = " +address);

        String gender = scan.next();
        String state = scan.next();
        String city = scan.next();






    }









}
