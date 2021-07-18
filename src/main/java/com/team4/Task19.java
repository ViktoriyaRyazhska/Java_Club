//Task 19 (Is n divisible by x and y?)
package com.team4;
public class Task19 {
	public static boolean isDivisible(long n, long x, long y) {
    if(n%x > 0 || n%x < 0 || n%y > 0 || n%y < 0)
      return false;
		return true;
	}

	public static void execute(){
		System.out.println("Input three numbers ");
		long n29 = MyMain.scanner.nextLong();
		long n30 = MyMain.scanner.nextLong();
		long n31 = MyMain.scanner.nextLong();
		System.out.println(Task19.isDivisible(n29, n30, n31));
	}
}
