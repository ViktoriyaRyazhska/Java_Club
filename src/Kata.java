import java.util.Scanner;

public class Kata {
    public static String switchItUp(int number) {
        switch (number) {
            case 1:
                if (number == 1) {
                    return "One";
                }
                break;
            case 2:
                if (number == 2) {
                    return "Two";
                }
                break;
            case 3:
                if (number == 3) {
                    return "Three";
                }
                break;
            case 4:
                if (number == 4) {
                    return "Four";
                }
                break;
            case 5:
                if (number == 5) {
                    return "Five";
                }
                break;
            case 6:
                if (number == 6) {
                    return "Six";
                }
                break;
            case 7:
                if (number == 7) {
                    return "Seven";
                }
                break;
            case 8:
                if (number == 8) {
                    return "Eight";
                }
                break;
            case 9:
                if (number == 9) {
                    return "Nine";
                }
                break;

            default:
                return "Zero";
        }
        return "";
    }
    public static void execute(Scanner sc) {
        System.out.println("This program switch int to String");
        System.out.println("Pleas enter your number");
        int number = sc.nextInt();
        String result = switchItUp(number);
        System.out.println(result);

    }
}
