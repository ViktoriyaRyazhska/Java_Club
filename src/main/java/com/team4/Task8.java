//Task 8 (Century From Year)
package com.team4;
public class Task8 {
  public static int century(int number) {
    int i = number / 100;
    if(number%100 > 0)
      i += 1;
    return i;
  }

  public static void execute(){
    System.out.println("Input your Year ");
    int n13 = MyMain.scanner.nextInt();
    System.out.println(Task8.century(n13));
  }
}
