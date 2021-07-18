//Task 25 (Opposites Attract)
package com.team4;
public class Task25 {

  public static boolean isLove(final int flower1, final int flower2) {
    if((flower1%2 > 0 && flower2%2 == 0) || (flower1%2 == 0 && flower2%2 > 0))
      return true;
    return false;
  }

  public static void execute(){
    System.out.println("Input flower 1 and flower 2 ");
    int n42 = MyMain.scanner.nextInt();
    int n43 = MyMain.scanner.nextInt();
    System.out.println(Task25.isLove(n42, n43));
  }
}
