package ex_08_If_Condition;

public class Lab001_If {
    public static void main(String[] args) {
        System.out.println("Enter the input using CLI \n"); //Command Line argument
        int age = Integer.parseInt(args[0]);
        if (age >= 18){
            System.out.println("Ready to caste a vote");}
        else {
            System.out.println("Not eligible to vote");}

    }
}
