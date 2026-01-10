package ex_10_Loops;

import java.util.Random;
import java.util.Scanner;

public class Lab007_Guessing_game {
    public static void main(String[] args) {
        // Guess a number from 1 to 100

        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100");
        int guess;
        int attempts =0;
        while (true)
        {
            if(!scanner.hasNextInt())
            {
                System.out.println("Enter a valid int number");
                scanner.next(); //consume invalid token
                continue;
            }
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < numberToGuess)
            {
                System.out.println("To Low, Try again");
            }
            else if (guess > numberToGuess)
            {
                System.out.println("To High ,Try again");
            }
            else
            {
                System.out.println("You guessed it right!!" + attempts);
                break;
            }
        }
    }
}
