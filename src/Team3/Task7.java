package Team3;


import java.util.Scanner;

public class Task7  {
    public static int past(int h,int m,int s){
        return h*3600000+m*60000+s*1000;
    }


    public static void showFunctionality(){
        System.out.println("This program returns the time since midnight in milliseconds")
        Scanner i = new Scanner(System.in);
        System.out.println("Enter hour :");
        int first = i.nextInt();
        System.out.println("Enter minute :");
        int second = i.nextInt();
        System.out.println("Enter second :");
        int third = i.nextInt();
        double multiple = past(first,second,third);

        System.out.println("time since midnight in milliseconds: "+ multiple );
    }
}











