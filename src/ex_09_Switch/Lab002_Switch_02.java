package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;
// Real time problem for automation tester
public class Lab002_Switch_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the preferred browser");
        if(scanner.hasNext()){
        String i = scanner.next();
        i = i.toLowerCase(); // if user doesn't input the value in lowercase
        switch(i) {

            case "chrome": {
                System.out.println("User choose Chrome browser to initiate the script");
                break;
            }
            case "edge": {
                System.out.println("User choose Edge browser to initiate the script");
                break;
            }
            case "firefox": {
                System.out.println("User choose firefox browser to initiate the script");
                break;
            }
            default: {
                System.out.println("Incompatible browser");
                break;
            }
        }
        } else
            System.out.println("Invalid Input");


        }
    }

