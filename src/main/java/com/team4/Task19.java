//Task 19 (Is n divisible by x and y?)
package com.team4;
public class Task19 {
	public static boolean isDivisible(long n, long x, long y) {
    if(n%x > 0 || n%x < 0 || n%y > 0 || n%y < 0)
      return false;
		return true;
	}
}
