package ex_06_Ternary_Op;

public class Lab004_Ternary_op_4 {
    public static void main(String[] args) {

        int n1 = 2;

        int n2 = 9;

        int n3 = -11;

        int result = (n1 > n2) ? n1 : (n2 > n3 ? n2 : n3);

        System.out.printf("MAX OUT OF THREE = %d", result);

    }
}
