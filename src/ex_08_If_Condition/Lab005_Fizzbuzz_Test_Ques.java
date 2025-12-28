package ex_08_If_Condition;

import java.util.Scanner;

public class Lab005_Fizzbuzz_Test_Ques {
    public static void main(String[] args) {

        for ( int number = 0; number <= 100; number++)
        {
            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
