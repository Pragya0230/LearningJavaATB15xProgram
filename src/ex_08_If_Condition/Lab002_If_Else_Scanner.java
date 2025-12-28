package ex_08_If_Condition;

import java.util.Scanner;

public class Lab002_If_Else_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age = ");
        int age = scanner.nextInt();
        if(age >= 18) {
            System.out.println("Adult");}
        else {
            System.out.println("Not Adult");}
        scanner.close();
    }
}
