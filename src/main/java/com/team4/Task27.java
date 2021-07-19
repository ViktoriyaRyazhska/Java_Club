//Task 27 (Will there be enough space?)
package com.team4;
public class Task27 {
  public static int enough(int cap, int on, int wait){
    int ans = (on + wait) - cap;
    if(ans < 0)
      ans = 0;
    return ans;
  }

  public static void execute(){
    System.out.println("Input your max number, people in bus and waiting people ");
    int n45 = MyMain.scanner.nextInt();
    int n46 = MyMain.scanner.nextInt();
    int n47 = MyMain.scanner.nextInt();
    System.out.println(Task27.enough(n45, n46, n47));
  }
}
