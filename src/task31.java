import java.util.Scanner;

public class task31 {
    public static int rentalCarCost(int d) {
        if (d <= 0) {
            throw new IllegalArgumentException();
        }
        return 7 <= d ? d * 40 - 50 : 3 <= d ? d * 40 - 20 : d * 40;
    }

    public static void execute(Scanner sc) {
        System.out.println("After a hard quarter in the office you decide to get some rest on a vacation. \n" +
                "So you will book a flight for you and your girlfriend and try to leave all the mess behind you.\n" +
                "\n" +
                "You will need a rental car in order for you to get around in your vacation. \n" +
                "The manager of the car rental makes you some good offers.\n" +
                "\n" +
                "Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. \n" +
                "Alternatively, if you rent the car for 3 or more days, you get $20 off your total.");
        System.out.println("Enter amount of days for: ");
        int days = sc.nextInt();
        System.out.println("You will pay " + rentalCarCost(days));
    }
}
