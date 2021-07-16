//Task 4 (Thinkful - Number Drills: Pixelart planning)
package com.team4;
public class Task4 {

  public static boolean isDivisible(int wallLength, int pixelSize) {
    if(wallLength%pixelSize==0)
      return true;
    return false;
  }

  public static void execute(){
    System.out.println("Input wallLength and pixelSize :");
    int n6 = MyMain.scanner.nextInt();
    int n7 = MyMain.scanner.nextInt();
    System.out.println(Task4.isDivisible(n6, n7));
  }
}
