package Team3;

import java.util.Scanner;

public class Task58 {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < one.length(); i++) {
            s.append(one.charAt(i));
            s.append(two.charAt(i));
            s.append(three.charAt(i));
        }
        return s.toString();
    }
    public static void showFunctionality(){
        System.out.println("This program return a string that combines \n" +
                " all of the letters of the three inputed strings in groups");
        System.out.println("First string");
        Scanner in = new Scanner(System.in);
        String one = in.next();
        System.out.println("Second string");
        String two = in.next();
        System.out.println("Third string");
        String three = in.next();
        System.out.println("Group of our strings is : ");
        System.out.println(tripleTrouble(one,two,three));


    }
}
