package com.team4;
public class Task48{

	public static void opposite(int number)
    {
        // your code here
		System.out.println((-1)*number);
    }
	public static void execute() {
		System.out.println("Print an integer: ");
		int n = MyMain.scanner.nextInt();
		opposite(n);
	}
}
