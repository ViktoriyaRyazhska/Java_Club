import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(doubleInteger(3));
    }

    public static int doubleInteger(int i) {
       i = i * i;

        return i;
    }
    public static void execute(Scanner sc) {
        System.out.println("This program calculate double integer ");
        System.out.println("Pleas enter your number");
        int number = sc.nextInt();
        int result = doubleInteger(number);
        System.out.println(result);
    }
}

