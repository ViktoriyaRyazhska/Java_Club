import java.util.Scanner;

public class task52 {
    public String sayHello(String [] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s",String.join(" ", name ),city,state);
    }
    public static void execute(Scanner sc) {
        System.out.println("This program return person's name and shows it city and state ");

    }
}
