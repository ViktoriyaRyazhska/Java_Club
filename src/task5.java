import java.util.Scanner;

public class task5 {

    public static String greet(String name) {
        if (!name.equals("Johnny")) {
            return String.format("Hello, %s!", name);
        } else {
            return "Hello, my love!";
        }

    }
    public static void execute(Scanner sc) {
        System.out.println("This program greets a person ");
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println(greet(name));
    }

}
