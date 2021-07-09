import java.util.Scanner;

public class task66 {
    public static String correct(String string) {
        return string.replace("5", "S").replace("O", "0").replace("1", "I");
    }

    public static void execute(Scanner sc) {
        System.out.println("Character recognition software is widely used to digitise printed texts. \n" +
                "Thus the texts can be edited, searched and stored on a computer.\n" +
                "When documents (especially pretty old ones written with a typewriter), \n" +
                "are digitised character recognition softwares often make mistakes.");
        System.out.println("This program helps you to replace such a situations like \n" +
                "S is misinterpreted as 5\n" +
                "O is misinterpreted as 0\n" +
                "I is misinterpreted as 1");
        System.out.println("Now enter string like that '1F-RUDYARD K1PL1NG' ");
        String s = sc.next();
        String result = correct(s);
        System.out.println("Your result " + result);
    }
}
