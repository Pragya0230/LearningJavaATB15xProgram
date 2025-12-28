package ex_04_Operators;

public class Lab002_Concat_Ques {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println(a+b); // int arithmetic

        String s ="Pragya ";
        String x = "Singhal";
        System.out.println(s+x); // String concat

        System.out.println(s + x + a + b);
        System.out.println(s + x + (a + b)); // BODMAS formula applied, as it will follow int (arith) first and then concat
        System.out.println(a + b + s + x);




    }
}
