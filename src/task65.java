import java.util.Scanner;

public class task65 {
    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
    public static void execute(Scanner sc) {
        System.out.println("This program sorts s and adds *** ");
    }
}
