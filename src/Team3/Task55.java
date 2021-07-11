package Team3;

import java.util.Scanner;

public class Task55 {
    public static String replaceDots(String str){
        return str.replace('.','-');
    }
    public static void showFunctionality(){
        System.out.println("This program  replaces all the dots '.' in the specified String str with dashes '-'");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter string :");
        String first = i.nextLine();
        String  multiple = replaceDots(first);

        if(!first.equals(""))
            System.out.println("Your new string: "+ multiple );
        else
            System.out.println("String can't be empty");
    }
}
