import java.util.Scanner;

public class task22 {
    public static String CalculateAge(int birth, int yearTo) {
        String yearOrYears;
        if (birth == yearTo) {
            return "You were born this very year!";
        } else if (yearTo < birth) {
            int years = birth - yearTo;
            yearOrYears = checkYearOrYears(years);
            return "You will be born in " + years + " " + yearOrYears + ".";
        } else {
            int years = yearTo - birth;
            yearOrYears = checkYearOrYears(years);
            return "You are " + years + " " + yearOrYears + " old.";
        }
    }
    private static String checkYearOrYears(int years) {
        if (years == 1) {
            return "year";
        } else {
            return "years";
        }
    }

    public static void execute(Scanner sc) {
        System.out.println("This method calculates \"how old will you be\" or \"how many years are left before your birth\"");
        System.out.println("Enter your birth year: ");
        int birth = sc.nextInt();
        System.out.println("Now, enter year in future or past");
        int yearTo = sc.nextInt();
        String result = CalculateAge(birth, yearTo);
        System.out.println(result);
    }
}
