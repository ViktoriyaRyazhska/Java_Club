package Team3;

import java.util.Scanner;

public class Task27 {
    public static String enough(int cap, int on,int  wait) {
        if(cap>=(on+wait))
            return("He can fit all "+wait+" passengers");
        else
            return("He can't fit "+((cap-on-wait)*-1)+" of the "+wait+" waiting");

    }
    public static void showFunctionality(){
        System.out.println("This program telling the driver if he will be able to fit all the passengers.");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the amount amount of people the bus can hold excluding the driver:");
        int first = i.nextInt();
        System.out.println("Enter the number of people on the bus excluding the driver:");
        int second = i.nextInt();
        System.out.println("Enter the number of people waiting to get on to the bus excluding the driver :");
        int third = i.nextInt();
        String multiple = enough(first,second,third);

        System.out.println( multiple );
    }
}
