package Team3;

import java.util.Scanner;

public class Task26 {
    public static String boolToWord(boolean b){
        if(b == true){
            return "Yes";
        }
        else
            return "No";
    }
    public static void showFunctionality(){

        System.out.println("This program return String 'Yes' if boolean true and return 'No' if false");
        System.out.println("Choose boolean statement");
        System.out.println("True = push 1 \n False - push  2");
        Scanner in = new Scanner(System.in);
        boolean b = in.nextBoolean();
        System.out.println(boolToWord(b));
    }
}
