//Task 35 (Beginner - Lost Without a Map)
package com.team4;
import java.util.*;
public class Task35 {
  public static int[] map(int[] arr) {
      return Arrays.stream(arr).map(x -> x*2).toArray();
  }

    public static void execute(){
        System.out.println("Input how many numbers ");
        int num = MyMain.scanner.nextInt();
        System.out.println("Input your numbers ");
        int[] n56 = new int[num];
        for(int i = 0; i < num; i++){
            n56[i] = MyMain.scanner.nextInt();
        }
        System.out.println(Arrays.toString(Task35.map(n56)));
    }
}
