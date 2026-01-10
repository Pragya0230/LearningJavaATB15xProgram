package ex_11_Functions;

import java.util.Scanner;

public class Lab002_User_defined_function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number a = ");
        int a = scanner.nextInt();
        System.out.println("Enter a number b = ");
        int b = scanner.nextInt();
        int sum = sum_of_number(a,b);
        System.out.println("Sum of a and b =" + sum);


    }
    static int sum_of_number(int x , int y)
    {
        return x+y;
    }
}
