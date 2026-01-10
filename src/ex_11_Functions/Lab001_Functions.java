package ex_11_Functions;

public class Lab001_Functions {
    public static void main(String[] args) {
        int max = Math.max(3,4); //Built-in function
        System.out.println(max);
        name_of_funtion();
       int i =  return_int_function();
        System.out.println(i);
    }
    static void name_of_funtion() // No parameter No return type
    {
        System.out.println("Hi");
    }
    static int return_int_function()
    {
        return 10;
    }
}
