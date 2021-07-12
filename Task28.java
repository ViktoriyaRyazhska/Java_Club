//Task 28 (The Modulo-3 Sequence)

public class Solution {
  public static int sequence(int n) {
    int[] nums = new int[]{0, 1, 1, 2, 0, 2, 2, 1};
    return nums[(n-1)%8];
  }
}
