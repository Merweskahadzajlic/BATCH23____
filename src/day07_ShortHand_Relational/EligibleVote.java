package day07_ShortHand_Relational;

public class EligibleVote {

    public static void main(String[] args) {
        String name = "Aaron King";

        int age = 34;

        String citizen = "UK";

        boolean eligibleToVote = age >=18 && citizen=="USA";
        //                        34>= 18 && "UK" =="USA"
        //                         TRUE       FALSE
        System.out.println( name + "is eligible to vote for Biden :" +eligibleToVote);

        String name2 = "Conor MCGregor";
        int age2 = 35;
        String citizen2 ="USA";

        boolean eligibleToVote2 = age2 >=18 && citizen2=="USA";

        System.out.println( name2 + " is eligible to vote2 for Biden: " +eligibleToVote2);








    }









}
