//Task 9 (Return Negative)
package com.team4;
public class Task9 {

  public static int makeNegative(int x) {
    if(x > 0)
      x *= -1;
    return x;
  }

  public static void execute(){
    System.out.println("Input your number ");
    int n14 = MyMain.scanner.nextInt();
    System.out.println(Task9.makeNegative(n14));
  }
}
