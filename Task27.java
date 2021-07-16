//Task 27 (Will there be enough space?)

public class Bob {
  public static int enough(int cap, int on, int wait){
    int ans = (on + wait) - cap;
    if(ans < 0)
      ans = 0;
    return ans;
  }
}
