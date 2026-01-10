package ex_11_Functions;

import java.util.Scanner;

public class Lab004_Functions_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner , "Enter a number a = ");
        int b = readInt(scanner , "Enter a number b = ");

        int result_sum = sum(a,b);
        int result_mul = multiply(a,b);
        int result_sub = subtract(a,b);
        int result_mod = mod(a,b);
        int result_div = divide(a,b);

        System.out.println("Sum of two nos." + result_sum);
        System.out.println("Sub of two nos." + result_sub);
        System.out.println("Multiply of two nos." + result_mul);
        System.out.println("Divide of two nos." + result_div);
        System.out.println("Mod of two nos." + result_mod);

        scanner.close();
    }
    public static int readInt(Scanner scanner , String prompt)
    {
        System.out.println(prompt);
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }
        else {
            System.out.println("Please enter a valid input");
            System.exit(0);
            return 0;
        }
    }
     public static int sum(int a , int b)
        {
            return a + b;
        }
    public static int subtract(int a , int b)
    {
        if(a>b){
        return a - b;}
        else
        {
          return b-a;
        }
    }
    public static int multiply(int a , int b)
    {
        return a * b;
    }
    public static int divide(int a , int b)
    {
        if (b==0)
        {
            throw new ArithmeticException("Zero is not allowed in division");
        }
        else{
        return a / b;}
    }
public static int mod(int a , int b)
{
        return a % b;
}

    }

