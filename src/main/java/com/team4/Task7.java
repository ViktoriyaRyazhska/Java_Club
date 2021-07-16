//Task 7 (Beginner Series #2 Clock)
package com.team4;
public class Task7
{
  public static int Past(int h, int m, int s)
  {
    m += h*60;
    s += m*60;
    return s*1000;
  }

  public static void execute(){
    System.out.println("Input three numbers :");
    int n10 = MyMain.scanner.nextInt();
    int n11 = MyMain.scanner.nextInt();
    int n12 = MyMain.scanner.nextInt();
    System.out.println(Task3.getVolumeOfCuboid(n10, n11, n12));
  }
}
