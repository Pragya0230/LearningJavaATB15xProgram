package ex_09_Switch;

public class Lab004_Switch {
    public static void main(String[] args) {
        int item = 2;
        switch(item){
            case 2 -> System.out.println("Correct"); //break is included in the syntax from JDK 13 onwards
            case 3 -> System.out.println("Incorrect");
            default -> System.out.println("Invalid");

        }
        int code = 006;
        switch(code){
            case 001 , 002 ,003 :
                System.out.println("Array1"); //can add multiple values in the case syntax from JDK 13 onwards
                break;
            case 004, 005 , 006 :
                System.out.println("Array2");
                break;
            default :
                System.out.println("Default");
                break;

        }
    }
}
