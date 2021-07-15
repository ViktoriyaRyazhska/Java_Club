import java.util.Scanner;

public class task19 {
    public static boolean isDivisible(long n, long x, long y) {
        if(n % x ==0 && n % y ==0){
            return true;
        }else {
            return false;
        }
    }
    public static void execute(Scanner sc) {
        System.out.println("This program checks for division ");
        System.out.println("Pleas enter your number");
        long number1 = sc.nextLong();
        long number2 = sc.nextLong();
        long number3 = sc.nextLong();

        boolean result = isDivisible(number1,number2,number3);
        System.out.println(result);
    }
}
