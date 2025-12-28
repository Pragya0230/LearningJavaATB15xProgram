package ex_06_Ternary_Op;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab003_Ternary_op_3 {
    public static void main(String[] args) {
        System.out.println("Enter the age =");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String result = (age < 18)? "Minor" : (age <=60)? "Adult" : "Sr. Citizen";
        System.out.println(result);
        scanner.close();
    }
}
