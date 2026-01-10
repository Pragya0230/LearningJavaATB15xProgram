package ex_11_Functions;

public class Lab003_Functions {
    public static void main(String[] args) {

        wop_wor_greet();
        String msg = wop_wr_greet();
        greet_with_details("Pragya", 66, 100);
        int i = multiply_two_numbers(9 , 10);
        System.out.println(i);

    }

    public static int multiply_two_numbers(int i, int i1) {
        return i * i1;
    }

    public static void greet_with_details(String pragya, int i, int i1) {

    }

    public static String wop_wr_greet() {
        return "pragya";
    }

    public static void wop_wor_greet() {
    }
}
