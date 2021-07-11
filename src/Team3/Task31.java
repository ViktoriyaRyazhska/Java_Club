package Team3;

import java.util.Scanner;

public class Task31 {
    public static int rentalCarCost(int d){
        if(d>=7)
            return d*40-50;
        else if(d>=3)
            return d*40-20;
        else
            return d*40;
    }
    public static void showFunctionality(){
        System.out.println("This program gives out the total amount for different days for rent a car");
        Scanner i = new Scanner(System.in);
        System.out.println("enter how many days you will rent a car:");
        int first = i.nextInt();
        int multiple = rentalCarCost(first);
        System.out.println("You need to pay "+multiple+" $");
    }
}
