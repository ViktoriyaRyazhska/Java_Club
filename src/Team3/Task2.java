package Team3;


import java.util.Scanner;

public class Task2  {

    public static double mulOfTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static void showFunctionality(){
        System.out.println("This program multiplies two numbers " +
                "enter first and second numbers");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter first number :");
        double first = i.nextDouble();
        System.out.println("Enter second number :");
        double second = i.nextDouble();
        double multiple = mulOfTwoNumbers(first,second);

        System.out.println(first + " * "
                + second + " = "
                + multiple );
    }
}











