package ex_10_Loops;
import java.util.Scanner;

public class Lab005_task_factorial {
    public static void main(String[] args) {
        System.out.println("Enter a positive number for calculating the factorial");
        Scanner scanner = new Scanner(System.in);

        int fact = 1;
        if (scanner.hasNextInt()) {
            int j = scanner.nextInt();
            for (int i = 1; i <= j; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of the number " + j + " is = " + fact);
        }
        else
            System.out.println("Invalid input");
        scanner.close();
    }
}
