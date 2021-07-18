package Team3;

import java.util.Scanner;

public class Task63 {
    static void printInitials(String name)
    {
        if (name.length() == 0)
            return;
        System.out.print(Character.toUpperCase(name.charAt(0)));
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print("." + Character.toUpperCase(name.charAt(i + 1)));
    }

    public static void showFunctionality(){
        System.out.println("This program converts a name into initials");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String letter =  sc.nextLine();
        printInitials(letter);
    }
}
