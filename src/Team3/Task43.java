package Team3;

import java.util.Scanner;

public class Task43 {
    static boolean isPerfect(int N)
    {
        if ((Math.sqrt(N) - Math.floor(Math.sqrt(N))) != 0)
            return false;
        return true;
    }

    // Function to find the closest perfect square
    // taking minimum steps to reach from a number
    static void getClosestPerfectSquare(int N)
    {
        if (isPerfect(N)) {
            System.out.println(N);
            return;
        }

        // Variables to store first perfect
        // square number
        // above and below N
        int aboveN = -1, belowN = -1;
        int n1;

        // Finding first perfect square
        // number greater than N
        n1 = N + 1;
        while (true) {
            if (isPerfect(n1)) {
                aboveN = n1;
                break;
            }
            else
                n1++;
        }

        // Finding first perfect square
        // number less than N
        n1 = N - 1;
        while (true) {
            if (isPerfect(n1)) {
                belowN = n1;
                break;
            }
            else
                n1--;
        }

        // Variables to store the differences
        int diff1 = aboveN - N;
        int diff2 = N - belowN;

        if (diff1 > diff2)
            System.out.println(belowN );
        else
            System.out.println(aboveN) ;
    }

    public static void showFunctionality() {
        System.out.println("This program  finds the nearest square number, nearest_sq(n), of a positive integer n");
        System.out.println("Enter number: ");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        getClosestPerfectSquare(n);
    }

}
