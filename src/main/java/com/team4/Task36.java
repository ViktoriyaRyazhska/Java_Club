//Task 36 (Counting sheep...)
package com.team4;
public class Task36 {
  public static int countSheeps(Boolean[] arrayOfSheeps) {
    int counter = 0;
    for (Boolean present : arrayOfSheeps) {
      if (present != null && present) {
        counter += 1;
      }
    }
    return counter;
  }

  public static void execute(){
    System.out.println("Input how many sheeps ");
    int sheep = MyMain.scanner.nextInt();
    System.out.println("Input your boolean sheeps(true or false) ");
    Boolean[] n57 = new Boolean[sheep];
    for(int i = 0; i < sheep; i++){
      n57[i] = MyMain.scanner.nextBoolean();
    }
    System.out.println(Task36.countSheeps(n57));
  }
}
