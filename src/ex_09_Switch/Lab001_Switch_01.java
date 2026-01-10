package ex_09_Switch;

import java.util.Scanner;
// You need to take a user input and ask for the integer from 1 to 7.
// And if user enters 1 to 7, 1- Mon,
// you will tell which day it is.

public class Lab001_Switch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any input value between 1 to 7");
        if(scanner.hasNextInt()) {
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter the valid number");
                    break;
            }
        }
        else
            System.out.println("Invalid input");

        scanner.close();

    }
}
