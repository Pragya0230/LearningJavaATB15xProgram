package ex_10_Loops;

import java.util.Scanner;

public class Lab001_forloop {
    public static void main(String[] args) {
        System.out.println("Print the value from 0 10 10");
       for(int i =0; i<=10; i++)
        {
            System.out.println(i);
        }


        System.out.println("Enter input");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        for (int j = 1; j <= age ; j++)
        {
            if(j >= 18)
            {
                System.out.println("Eligible to vote");
            }
            else {
                System.out.println("Underage");
            }
        }
    }
}
