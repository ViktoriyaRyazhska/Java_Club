//Task 31 (Transportation on vacation)
package com.team4;
public class Task31 {
  public static int rentalCarCost(int d) {
    if(d >= 7)
      return d*40 - 50;
    else if(d >= 3)
      return d*40 - 20;
    else
      return d*40;
  }

  public static void execute(){
    System.out.println("Input your rentalCarCost ");
    int n51 = MyMain.scanner.nextInt();
    System.out.println(Task31.rentalCarCost(n51));
  }
}
