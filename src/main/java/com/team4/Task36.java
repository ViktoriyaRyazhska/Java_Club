//Task 36 (Counting sheep...)
package com.team4;
public class Task36 {
  public static int countSheeps(Boolean[] arrayOfSheeps) {
    int counter = 0;
    for (Boolean present : arrayOfSheeps) {
      if (present != null && present) {
        counter += 1;
      }
    }
    return counter;
  }

  public static void execute(){ }
}
