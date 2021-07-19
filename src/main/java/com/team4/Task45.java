package com.team4;
public class Task45{
	
	public static void makeMove(int sticks) {
	   if(sticks % 4 == 0) System.out.print("1");
	   else System.out.print(sticks % 4);
	  }
	public static void execute() {
		System.out.println("Make a move: ");
		int n = MyMain.scanner.nextInt();
		makeMove(n);
	}
	
}
