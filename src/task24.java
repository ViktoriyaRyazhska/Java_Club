import java.util.Scanner;

public class task24 {
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch(op) {
            case "+": return v1+v2;
            case "-": return v1-v2;
            case "*": return v1*v2;
            case "/": return v1/v2;
            default: return 0;
        }
    }
    public static void execute(Scanner sc) {
        System.out.println("This program does four basic mathematical operations.\n" +
                "+, -, *, /");
        System.out.println("Enter operation: ");
        String op = sc.nextLine();
        System.out.println("Good. Now give me a number");
        int v1 = sc.nextInt();
        System.out.println("And another one");
        int v2 = sc.nextInt();
        Integer result = basicMath(op, v1, v2);
        System.out.println("Your result is " + result);
    }
}
