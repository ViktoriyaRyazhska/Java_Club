package Team3;

import java.util.Scanner;

public class Task8 {
        public static int century(int number) {
                // your code goes here
                int century2 = (number  / 100) + 1;
                return century2;
        }

        public static void showFunctionality() {
                System.out.println("Given a year, return the century");
                Scanner i = new Scanner(System.in);
                System.out.println("enter year");
                int century = i.nextInt();
                System.out.println("The century is :" + century(century));

        }
}
