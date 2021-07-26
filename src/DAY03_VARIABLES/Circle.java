package DAY03_VARIABLES;

public class Circle {

    public static void main(String[] args) {

        int r = 5 ;

        double pi = 3.14;

        double area = r*r*pi;

        double perimeter = 2*r * pi ;
        System.out.println("Area:"); //does not append me line after printing
        System.out.println(area ); // appends new line after printing

        System.out.println("Perimeter : "); //does not append new line after printing
        System.out.println( perimeter); // appends new line after printing


    }


}
