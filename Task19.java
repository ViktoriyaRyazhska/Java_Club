//Task 19 (Is n divisible by x and y?)

public class DivisibleNb {
	public static boolean isDivisible(long n, long x, long y) {
    if(n%x > 0 || n%x < 0 || n%y > 0 || n%y < 0)
      return false;
		return true;
	}
}
