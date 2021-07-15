package Team3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task70 {
    public static List CreateList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number;count++)
        {
            list.add(count);
        }

        return list;
    }

    public static void showFunctionality(){
        System.out.println("This program create list of number ");
        System.out.println("Enter list size");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        System.out.println("List : " + CreateList(length));

    }
}
