package Team3;

import java.util.Scanner;

public class Task54{
    public static int opposite(int number)
    {
        if(number == 0){
            return 0;
        }
        else
            return number * -1;
    }
    public static void showFunctionality(){
        System.out.println("This program makes opposite number ");
        System.out.println("Enter your number : ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Opposite number for " + number + " is " + opposite(number));
    }

}