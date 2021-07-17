import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task69 {
    public static List<String> push(String str){
        List<String> items = new ArrayList<>();
        items.add(str);
        return items;
    }
    public static void execute(Scanner sc) {
        System.out.println("This program add an object to list ");
        System.out.println("Enter object which you want to add");
        String item = sc.next();
        List<String> list = new ArrayList<>();
        boolean result = list.add(item);
        System.out.println(result);
    }
}
