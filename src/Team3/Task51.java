package Team3;

import java.util.Scanner;

public class Task51 {
    public static String numberToString(Integer num) {
        return num.toString();
    }
    public static void showFunctionality(){
        System.out.println("This program  transforms a number into a string");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter number :");
        int first = i.nextInt();
        String  multiple = numberToString(first);

        System.out.println("Your string: "+ multiple );
    }
}
