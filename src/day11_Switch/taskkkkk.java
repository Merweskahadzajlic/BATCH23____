package day11_Switch;

public class taskkkkk {
    public static void main(String[] args) {
        double n1=100;
        double n2 = 4.7;
        char operators='/';
        double result1=0;
       // char mathOperator = '&';  // +, -, *, /     ==

        switch(operators) {
            case '-':

                result1 = (n1 - n2);
                break;
            case '+':

                result1 = (n1 + n2);
                break;
            case '*':

                result1 = (n1 * n2);
                break;
            case '/':

                result1 = (n1 / n2);
                break;

            default:
                System.out.println("invalid operator");
        }
        System.out.println("result1="+result1);




        }









    }






