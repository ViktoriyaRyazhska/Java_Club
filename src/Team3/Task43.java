package Team3;

import java.util.Scanner;

public class Task43 {
    public static int nearestSq(final int n){
        int k;

        if ((Math.sqrt(n) - Math.floor(Math.sqrt(n))) == 0) {
            k = n;

        }
        else {
            int aboveN = -1, belowN = -1;
            int n1;

            n1 = n + 1;
            while (true) {
                if (((Math.sqrt(n1) - Math.floor(Math.sqrt(n1))) == 0)) {
                    aboveN = n1;
                    break;
                }
                else
                    n1++;
            }

            n1 = n - 1;
            while (true) {
                if (((Math.sqrt(n1) - Math.floor(Math.sqrt(n1))) == 0)) {
                    belowN = n1;
                    break;
                }
                else
                    n1--;
            }


            int diff1 = aboveN - n;
            int diff2 =n - belowN;

            if (diff1 > diff2)
                k =belowN ;
            else
                k =aboveN ;}
        return k;


    }

    public static void showFunctionality() {
        System.out.println("This program  finds the nearest square number of a positive integer n");
        System.out.println("Enter number: ");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println(nearestSq(n));
    }

}
