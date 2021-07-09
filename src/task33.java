import java.util.Scanner;

public class task33 {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 0;
        int dogYears = 0;


        if( humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        }

        else if( humanYears == 2) {
            catYears = 24;
            dogYears = 24;
        }

        else if (humanYears >= 3) {
            catYears = 4 * (humanYears - 2) + 24;
            dogYears = 5 * (humanYears - 2) + 24;
        }


        return new int[]{humanYears, catYears, dogYears};
    }
    public static void execute(Scanner sc) {
        System.out.println("This program calculate human years, cat years and dog years");

    }
}
