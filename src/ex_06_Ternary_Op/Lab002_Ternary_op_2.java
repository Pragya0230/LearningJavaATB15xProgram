package ex_06_Ternary_Op;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab002_Ternary_op_2 {
    public static void main(String[] args) {

        //Ques1 Nesting ternary operator
        int age = 21;
        String result = (age > 18) ? (age > 25 ? "You can drink": "You can't Drink") :"No you cannot go to GOA";
        System.out.println(result);

        // Ques 2 Pass or Fail
        int marks ;
        System.out.println("Enter the marks between 0 & 100 =");
        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();
        String result1 = (marks >= 40) ? "PASS" :"FAIL";
        System.out.println(result1);
        scanner.close();

        //Ques3 Max number fetching
        int x = 10;
        int y = 20;
        int result3 = x > y ? x : y; //max number fetching
        System.out.println(result3);

        //Ques4 Even & Odd number
        int l = 15;
        String result5 = l%2 ==0 ? "Even" : "Odd";
        System.out.println(result5);


    }
}
