package ex_10_Loops;

public class Lab003_for_loop_break {
    public static void main(String[] args) {
        for(int i = 0; i< 50 ; i++)
        {
            System.out.println(i); // will print from 0 to 5
            if(i==5)
            {
                break; // exit the loop
            }
            //System.out.println(i); value from 0 10 4 will print
        }
        System.out.println("End of a program");
    }
}
