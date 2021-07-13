//Task 32 (String repeat)

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
      if(repeat == 0)
        return "";
      String ans = string;
      for(int i = 1; i < repeat; i++)
        ans += string;
        return ans;
    }
}
