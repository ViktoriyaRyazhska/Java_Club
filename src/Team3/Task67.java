package Team3;

import java.util.Scanner;

public class Task67 {
    public static void convertOpposite(StringBuffer str)
    {
        int ln = str.length();

        for (int i = 0; i < ln; i++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i + 1, Character.toUpperCase(c) + "");
            else
                str.replace(i, i + 1, Character.toLowerCase(c) + "");
        }
    }

    public static void showFunctionality() {
        System.out.println("In this program lowercase letter becomes uppercase and each uppercase letter becomes lowercase");
        Scanner console =new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String str = console.nextLine();
        sb.append(str);
        convertOpposite(sb);

        System.out.println(sb);
    }

}
