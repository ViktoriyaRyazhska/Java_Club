package Team3;

import java.util.Scanner;

public class Task4 {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        if(wallLength == 0 || pixelSize == 0){
            return true;
        }
        else {
            return wallLength%pixelSize==0;
        }
    }
    public static void showFunctionality(){
        Scanner i  = new Scanner(System.in);
        System.out.println("Enter walls length");
        int wallLength = i.nextInt();
        System.out.println("Enter pixelSize");
        int pixelSize = i.nextInt();
        System.out.println(isDivisible(wallLength, pixelSize));
    }
}
