package Team3;

import java.util.Scanner;

public class Task38 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int [] allStudents = new int [classPoints.length + 1];
        for (int i = 0; i < classPoints.length; i++) {
            allStudents[i] = classPoints[i];
        }
        allStudents[allStudents.length - 1] = yourPoints;

        int sum = 0;
        for (int i = 0; i < allStudents.length; i++) {
            sum += allStudents[i];
        }
        int average = sum/allStudents.length;
        if(yourPoints <= average){return false;}
        else
            return true;
    }
    public static void showFunctionality(){
        System.out.println("This program checks if your marks better then average");
        System.out.println("Enter number of marks : ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter number :");
            arr[i] = in.nextInt();
        }
        System.out.println("Enter your mark : ");
        int mark = in.nextInt();
        if(betterThanAverage(arr,mark) == true){
            System.out.println("You are better");
        }
        else
            System.out.println("You don't better");

    }
}
