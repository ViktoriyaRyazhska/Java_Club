import java.util.Scanner;

public class Task60 {
    public static int howOld(final String herOld) {

        String s = herOld.substring(0,1);
        return Integer.parseInt(s);

    }

    public static void execute(Scanner sc) {
        System.out.println("This program calculate girl's ages ");
        System.out.println("Pleas enter herAge");
        String s = sc.next();
        int result = howOld(s);
        System.out.println(" Your result is " + result);
    }
}
