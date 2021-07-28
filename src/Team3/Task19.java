package Team3;


import java.util.Scanner;

public class Task19  {

    public static boolean isDivisible(long n, long x, long y) {
        try {
            if(n%x==0 && n%y==0 && x!= 0 && y != 0)
                return true;
        }catch (ArithmeticException e){
            System.out.println("Division by zero");
        }
        return false;
    }

    public static void showFunctionality(){
        System.out.println("This program checks if a number n is divisible by two numbers x AND y. All inputs must be a positive, non-zero digits.");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter n :");
        int first = i.nextInt();
        System.out.println("Enter x :");
        int second = i.nextInt();
        System.out.println("Enter y :");
        int third = i.nextInt();
        boolean multiple = isDivisible(first,second,third);
        System.out.println(multiple);
        /*if(multiple==true)
            System.out.println("true , a number "+ first +" is divisible "+ second +" and "+third);
        else
            System.out.println("false  , a number "+ first +" is not divisible by "+ second +" and "+third);*/
    }
}











