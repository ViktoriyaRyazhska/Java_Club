import java.util.Scanner;

public class task65 {
    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }
    public static void execute(Scanner sc) {
        System.out.println("This program sorts it alphabetically (case-sensitive, and based on the ASCII values of the chars) \n" +
                "and then return the first value.\n" +
                "\n" +
                "The returned value will be a string, and have \"***\" between each of its letters.");
        System.out.println("Enter how much string do you want to add: ");
        int number = sc.nextInt();
        String[] stings = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter your string: ");
            stings[i] = sc.next();
        }

        System.out.println("This is your result: " + twoSort(stings));
    }
}
