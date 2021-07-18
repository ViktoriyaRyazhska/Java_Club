import java.util.Scanner;

public class task10 {
    public static String datingRange(int age) {
        int minAge;
        int maxAge;
        if (age <= 14) {
            minAge = (int) (age - 0.10 * age);
            maxAge = (int) (age + 0.10 * age);
        } else {
            minAge = age/2 + 7;
            maxAge = (age-7) * 2;
        }

        return minAge + "-" + maxAge;
    }


    public static void execute(Scanner sc) {
        System.out.println("Everybody knows the classic \"half your age plus seven\" dating rule \nthat a lot of people follow (including myself).\n" +
                "It's the 'recommended' age range in which to date someone.");
        System.out.println("Please enter your age: ");
        int n = sc.nextInt();
        String result = datingRange(n);
        System.out.println("Your partner age should be from/till " + result);
    }

}
