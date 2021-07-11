package Team3;

import java.util.Arrays;
import java.util.Scanner;

public class Task35 {
    public  static void doubleNumber(){
        System.out.println("enter the number of the digits: ");
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        int[]array = new int[n];
        Scanner console = new Scanner(System.in);

        for(int i=0;i<n;i++) {
            System.out.println("Введіть "+(i+1)+" число масиву");
            array[i]=console.nextInt();
        }
        for(int j=0;j<n;j++){
            array[j]= array[j]*2;
        }
        System.out.println("Your array with double numbers: ");
        System.out.println(Arrays.toString(array));
    }

    public static void showFunctionality() {
        System.out.println("This program returns your array with each value doubled.");
        doubleNumber();
    }
}
