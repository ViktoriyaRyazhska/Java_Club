import java.util.Scanner;

public class task20 {

    public static String convert(boolean b){
        if(b) {
            return "true";
        } else {
            return "false";
        }

    }

    public static void execute(Scanner sc) {
        System.out.println("This program converts boolean true or false to string");
        System.out.println("To put 'true' press 1, 'false' press 2: ");
        int n = sc.nextInt();
        String result;
        if (n == 1) {
            result = convert(true);
        } else {
            result = convert(false);
        }
        System.out.println("Your result: " + result);
    }
}
