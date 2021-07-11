package Team3;

import java.util.Scanner;

public class Task6 {
    public static int toBinary(int number){
        return Integer.parseInt(Integer.toBinaryString(number));
    }

    public static void showFunctionality(){
        System.out.println("This program converts Int number to Binary");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter Int number :");
        int n = i.nextInt();
        System.out.println("Binary from Int "+ n + " = "
                + Task6.toBinary(n));
    }
}
