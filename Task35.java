//Task 35 (Beginner - Lost Without a Map)

import java.util.*;
public class Maps {
  public static int[] map(int[] arr) {
      return Arrays.stream(arr).map(x -> x*2).toArray();
  }
}
