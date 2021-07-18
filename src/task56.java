import java.util.Scanner;

public class task56 {
    public static String areYouPlayingBanjo(String name) {
        if (name.toLowerCase().startsWith("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }


    public static void execute(Scanner sc) {
        System.out.println("This program answers the question \"Are you playing banjo?\".\n" +
                "If your name starts with the letter \"R\" or lower case \"r\", you are playing banjo!");
        System.out.println("Enter any name: ");
        String str = sc.next();
        System.out.println(areYouPlayingBanjo(str));
    }
}
