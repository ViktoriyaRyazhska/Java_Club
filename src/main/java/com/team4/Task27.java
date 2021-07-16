//Task 27 (Will there be enough space?)
package com.team4;
public class Task27 {
  public static int enough(int cap, int on, int wait){
    int ans = (on + wait) - cap;
    if(ans < 0)
      ans = 0;
    return ans;
  }

  public static void execute(){ }
}
