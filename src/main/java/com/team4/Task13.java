//Task 13 (FIXM: Static electrickery)
package com.team4;
public class Task13 {

  private static int ONE_HUNDRED = 100;

  public static final Task13 INST = new Task13();

  private final int value;

  private Task13() {
    value = ONE_HUNDRED;
  }

  public int plus100(int n) {
    return value + n;
  }

  public static void execute(){
    System.out.println("Input your number ");
    int n20 = MyMain.scanner.nextInt();
    System.out.println(Task13.INST.plus100(n20));
  }
}
