//Task 32 (String repeat)
package com.team4;
public class Task32 {
    public static String repeatStr(final int repeat, final String string) {
      if(repeat == 0)
        return "";
      String ans = string;
      for(int i = 1; i < repeat; i++)
        ans += string;
        return ans;
    }

    public static void execute(){ }
}
