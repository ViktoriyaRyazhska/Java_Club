//Task 8 (Century From Year)

public class Solution {
  public static int century(int number) {
    int i = number / 100;
    if(number%100 > 0)
      i += 1;
    return i;
  }
}
