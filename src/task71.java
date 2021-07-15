import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task71 {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        return listOfNumbers.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
    }

    public static void execute(Scanner sc) {
        System.out.println("This program accepts list of integers and deletes even numbers");
        System.out.println("Enter size of list: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your number: ");
            list.add(sc.nextInt());
        }
        System.out.println("Your list after filtering: " + filterOddNumber(list));
    }
}
