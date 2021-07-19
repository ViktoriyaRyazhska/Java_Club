//Task 6 (Convert to Binary)
package com.team4;
public class Task6 {

  public static int toBinary(int n) {

    return Integer.valueOf(Integer.toBinaryString(n));
  }

  public static void execute(){
    System.out.println("Input your number ");
    int n9 = MyMain.scanner.nextInt();
    System.out.println(Task6.toBinary(n9));
  }
}
