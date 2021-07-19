package com.team4;
public class Task48{

	public static int opposite(int number)
    {
        // your code here
		return (-1)*number;
    }
	public static void execute() {
		System.out.println("Print an integer: ");
		int n = MyMain.scanner.nextInt();
		int op = opposite(n); System.out.println(op);
	}
}
