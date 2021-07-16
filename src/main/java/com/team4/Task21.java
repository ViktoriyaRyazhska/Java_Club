//Task 21 (Do I get a bonus?)
package com.team4;
public class Task21{
  public static String bonusTime(final int salary, final boolean bonus) {
    String s = "£";
    if(bonus == true)
      s+=Integer.toString(salary*10);
    else
      s+=Integer.toString(salary);
    return s;
  }

  public static void execute(){ }
}
