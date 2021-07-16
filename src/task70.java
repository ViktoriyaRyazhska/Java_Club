import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task70 {
    public static List<Integer> CreateList(int number)
    {
        List<Integer> list = new ArrayList<>();

        for(int count = 1; count <= number; count++)
        {
            list.add(count);
        }

        return list;
    }

    public static void execute(Scanner sc) {
        System.out.println("This program creates ArrayList and fills it");
        System.out.println("Enter size of list: ");
        int n = sc.nextInt();
        List<Integer> list = CreateList(n);
        System.out.println("Your list: " + list);
    }
}
