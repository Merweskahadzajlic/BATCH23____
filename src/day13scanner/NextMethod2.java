package day13scanner;

import java.util.Scanner;

public class NextMethod2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age ");

        int age = scan.nextInt();

        System.out.println("Enter your job title");
        String jobTitle = scan.nextLine();


        System.out.println("age = "+age);
        System.out.println("jobTitle= " + jobTitle);


    }


}

