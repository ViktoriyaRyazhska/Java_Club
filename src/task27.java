import java.util.Scanner;

public class task27 {
    public static int enough(int cap, int on, int wait){
        return Math.max(on + wait - cap, 0);
    }

    public static void execute(Scanner sc) {
        System.out.println("Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. \n" +
                "With so many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus! \n" +
                "He wants you to write a simple program telling him if he will be able to fit all the passengers.");
        System.out.println("Enter amount of people the bus can hold excluding the driver: ");
        int cap = sc.nextInt();
        System.out.println("Enter the number of people on the bus excluding the driver: ");
        int on = sc.nextInt();
        System.out.println("Enter the number of people waiting to get on to the bus excluding the driver: ");
        int wait = sc.nextInt();

        System.out.println(enough(cap, on, wait));
    }
}
