package ex_05_Type_Casting;

public class Lab001_TypeCasting_1 {
    public static void main(String[] args) {
        byte b = 2;
        int  a= b; // Implicit Widening - Valid syntax , JVM supports default
        int v = (int) b; // Explicit Widening
       // boolean v = b;  Incompatible data types
        int r = 300;
        byte y = (byte) r; // Implicit Narrowing is not possible in case of JAVA
        // first convert into binary , out of that it will pick the supported bits and convert back to decimal
        System.out.println(y);
        System.out.println(a);

        //Example
        int course = 100;
        float gst = 18.45f;
        int total = course + (int) gst;
        System.out.println(total);

        float total1 = course + gst;
        System.out.println(total1);



    }
}
