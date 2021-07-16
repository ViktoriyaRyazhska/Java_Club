//Task 34 (Get the mean of an array)
package com.team4;
public class Task34{

  public static int getAverage(int[] marks){
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }

    return sum / marks.length;
  }

  public static void execute(){ }
}
