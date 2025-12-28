package ex_08_If_Condition;

import java.util.Scanner;

public class Lab003_If_ElseIf_Else {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > 0) {
            System.out.println("positive");}
        else if (number < 0) {
            System.out.println("negative");}
        else {
            System.out.println("zero");}
        scanner.close();
    }
}
