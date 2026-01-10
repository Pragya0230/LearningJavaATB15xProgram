package ex_10_Loops;
// skipping the even number from printing
public class Lab004_for_loop {
    public static void main(String[] args) {

        for( int i = 1 ; i <= 50 ; i++)
        {
            if(i%2 ==0)
            {
                continue;
            }
            System.out.println(i);
        }

    }
}
