package ex_10_Loops;

public class Lab004_for_loop_continue {
    public static void main(String[] args) {
        for(int i = 0; i< 10 ; i++)
        {
            if(i==5)
            {
                continue; // skip the next steps in the loop (5 will not be printed)
            }
            System.out.println(i);
        }
        System.out.println("End of a program");
    }
}
