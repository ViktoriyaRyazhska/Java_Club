//Task 33 (Cat years, Dog years)
package com.team4;
public class Task33 {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    if(humanYears == 1)
      return new int[]{1,15,15};
    else if(humanYears == 2)
      return new int[]{2,24,24};
    else
      return new int[]{humanYears,(humanYears-2)*4+24,(humanYears-2)*5+24};
  }

  public static void execute(){ }
}
