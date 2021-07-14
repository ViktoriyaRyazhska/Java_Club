import java.util.Scanner;

public class task57 {
    static String noSpace(final String x) {

        return x.replaceAll("\\s+","");
    }
    public static void execute(Scanner sc) {
        System.out.println("This program deletes all spaces ");
        System.out.println("Pleas enter your number");
        String element = sc.nextLine();
        String result = noSpace(element);
        System.out.println(result);
    }
}
