package Team3;

import java.util.Scanner;

public class Task42 {
    public static int TwiceAsOld(int dadYears, int sonYears){
        if(dadYears - sonYears * 2 > 0){
            return dadYears - sonYears*2;
        }
        return sonYears - (dadYears - sonYears);

    }
    public static void showFunctionality(){
        System.out.println("This program Сalculate how many years ago the father was twice as old as his son \n" +
                "(or in how many years he will be twice as old)");
        System.out.println("Enter how old father : ");
        Scanner in = new Scanner(System.in);
        int dad = in.nextInt();
        System.out.println("Enter how old son : ");
        int son = in.nextInt();
        System.out.println("Result : " + TwiceAsOld(dad,son));
    }
}
