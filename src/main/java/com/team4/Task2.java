//Task 2 (Function 3 - multiplying two numbers)
package com.team4;
public class Task2 {
    public static int multiply(int num1, int num2) {
        return num1*num2;
    }

    public static void execute(){
        System.out.println("Input two numbers :");
        int n1 = MyMain.scanner.nextInt();
        int n2 = MyMain.scanner.nextInt();
        System.out.println(Task2.multiply(n1, n2));
    }
}
