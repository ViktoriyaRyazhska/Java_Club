//Task 25 (Opposites Attract)
package com.team4;
public class Task25 {

  public static boolean isLove(final int flower1, final int flower2) {
    if((flower1%2 > 0 && flower2%2 == 0) || (flower1%2 == 0 && flower2%2 > 0))
      return true;
    return false;
  }

  public static void execute(){ }
}
