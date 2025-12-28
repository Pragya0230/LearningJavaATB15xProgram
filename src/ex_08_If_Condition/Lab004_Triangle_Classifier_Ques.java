package ex_08_If_Condition;

import java.util.Scanner;

public class Lab004_Triangle_Classifier_Ques {
    public static void main(String[] args) {
        System.out.println("Enter the side 1 =");
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        System.out.println("Enter the side 2 =");
        int s2 = scanner.nextInt();
        System.out.println("Enter the side 3 =");
        int s3 = scanner.nextInt();
        if((s1 == s2) && (s2 == s3) && (s3 == s1))
        {
            System.out.println("Equilateral Triangle");
        }
        else if ( (s1 != s2) && (s2 != s3) && (s3 != s1) )
        {
            System.out.println("Scalene Triangle");
        }
        else {
            System.out.println("Isosceles Triangle");
        }
    }
}
