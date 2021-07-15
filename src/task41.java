import java.util.Arrays;
import java.util.Scanner;

public class task41 {

    public static void execute(Scanner sc) {
        System.out.println("You're at the zoo... all the meerkats look weird. \n" +
                "Something has gone terribly wrong - someone has gone and switched their heads and tails around!\n" +
                "\n" +
                "Save the animals by switching them back. You will be given an array which will have three values (tail, body, head). ");
        System.out.println("This program re-arranges the array so that the animal is the right way round (head, body, tail).");
        String[] array = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter part of body: ");
            array[i] = sc.next();
        }
        System.out.println("Your array after fix " + Arrays.toString(fixTheMeerkat(array)));
    }

    public static String[] fixTheMeerkat(String[] arr) {
        swap(arr, 0, arr.length - 1);
        return arr;
    }

    private static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
