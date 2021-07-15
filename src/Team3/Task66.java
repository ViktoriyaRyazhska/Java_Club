package Team3;

import java.util.Scanner;

public class Task66 {
    public static String correct(String string) {
        StringBuilder s = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if('5' == s.charAt(i)){
                s.setCharAt(i,'S');
            }
            else if('0' == string.charAt(i)){
                s.setCharAt(i,'O');
            }
            else if('1' == string.charAt(i))
            {
                s.setCharAt(i,'I');
            }
        }
        return s.toString();
    }

    public static void showFunctionality(){
        System.out.println("This program replaces erroneous characters in the text");
        System.out.println("'5' should be 'S'");
        System.out.println("'O' should be '0'");
        System.out.println("'I' should be '1'");
        System.out.println("Example incorrect text : ");
        System.out.println("1F-RUDYARD K1PL1NG");
        System.out.println("Correct result : " + correct("1F-RUDYARD K1PL1NG"));

    }
}
