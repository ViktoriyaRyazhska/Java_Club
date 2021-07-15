import java.util.Scanner;

public class task67 {
    public static String toAlternativeString(String string) {
        StringBuilder s = new StringBuilder();
        string.chars()
                .forEach( i -> {
                    char c = (char) i;
                    s.append( Character.isUpperCase(c) ? Character.toLowerCase(c): Character.toUpperCase(c));
                });
        return s.toString();
    }

    public static void execute(Scanner sc) {
        System.out.println("This program makes each lowercase letter uppercase and each uppercase letter makes lowercase");
        System.out.println("Enter string like 'altERnaTIng cAsE': ");
        String s = sc.next();
        System.out.println("Your result is " + toAlternativeString(s));
    }
}
