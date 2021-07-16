//Task 1 (You Can't Code Under Pressure #1)
package com.team4;
class Task1 {
  public static int doubleInteger(int i) {
    i *= 2;
    return i;
  }

  public static void execute(){
    System.out.println("Input your number ");
    int n = MyMain.scanner.nextInt();
    System.out.println(Task1.doubleInteger(n));
  }
}
