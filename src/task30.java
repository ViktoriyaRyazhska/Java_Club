import java.util.Scanner;

public class task30 {
    public static String updateLight(String current) {

        switch (current) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
        }
        throw new RuntimeException();
    }


    public static void execute(Scanner sc) {
        System.out.println("This method changes color on traffic lights");
        System.out.println("Enter 'green', 'yellow' or 'red' and you will get next color: ");
        String color = sc.next();
        String result = updateLight(color);
        System.out.println("Next color is " + result);
    }
}
