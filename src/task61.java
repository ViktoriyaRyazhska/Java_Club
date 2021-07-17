import java.util.Scanner;

public class task61 {
    public static int howOld(final String herOld) {

        int girlAge = Integer.parseInt(herOld.substring(0,1));

        if (girlAge > 0 && girlAge <= 2) {
            throw new IllegalArgumentException("She is too small to talking");
        }

        return girlAge;
    }

    public static void execute(Scanner sc) {
        System.out.println("This program calculate girl's ages ");
        System.out.println("Pleas enter herAge");
        String s = sc.next();
        int result = howOld(s);
        System.out.println(" Your result is " + result);
    }
}
