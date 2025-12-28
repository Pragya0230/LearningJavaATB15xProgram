package ex_04_Operators;

public class Lab001_Operators {
    public static void main(String[] args) {
        int i =10 ; // = is assignment operator RHV to LS

        // arithmetic operators
        int a= 10;
        int b = 7 ;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a%b); //Modulus operator (reminder)

        //Relational operator < , > , => , !=
        int age1 = 18;
        int age2 = 20;
        boolean age = age1>= age2;
        System.out.println(age);


        //Unary Operator
        int c = +10; //+ is a by default operator in Java
        int d = -5;
        System.out.println(c+d);

        int e = -1;
        e = e+1;
        System.out.println(e);

        //Logical Operator && / || / !
        boolean n = true;
        System.out.println(!!n);

        boolean p = true || false;
        System.out.println(p);


        //compound operator += ,/= , -=
        int m = 10;
        m += m ; // m= m+10;
        System.out.println(m);


        //new operator
        String s = new String("Pragya");
        System.out.println(s);

        //instanceof operator

        String s1 = new String("Pramod");
        System.out.println(s1 instanceof String);



    }
}
