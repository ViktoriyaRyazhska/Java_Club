package Team3;

import java.util.Scanner;

public class Task18 {
    public static int opposite(int number){
        int temp = number;
        number = -temp;
        return number;
    }

    public static void showFunctionality(){
        System.out.println("This program makes opposite of entered number");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = i.nextInt();
        System.out.println(n + ": " + opposite(n));


    }
}
