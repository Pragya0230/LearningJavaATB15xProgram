package ex_10_Loops;

public class Lab002_for_loop {
    public static void main(String[] args) {
        // find the even nos. from 1 to 50

        for(int i= 1 ; i <= 50 ; i++)
        {
            if(i%2 == 0)
            {
                System.out.println("Even number= " + i);
            }
            /*else
                System.out.println("Odd number= " + i);*/

        }
    }
}
