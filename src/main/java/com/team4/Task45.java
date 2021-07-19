package com.team4;
public class Task45{
	
	public static int makeMove(int sticks) {
	   return sticks % 4 == 0 ? 1 : sticks % 4;
	  }
	public static void execute() {
		System.out.println("Make a move: ");
		int n = MyMain.scanner.nextInt();
		int move = makeMove(n);
		System.out.println(move);
	}
	
}
