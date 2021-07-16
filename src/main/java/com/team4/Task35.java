//Task 35 (Beginner - Lost Without a Map)
package com.team4;
import java.util.*;
public class Task35 {
  public static int[] map(int[] arr) {
      return Arrays.stream(arr).map(x -> x*2).toArray();
  }

    public static void execute(){ }
}
