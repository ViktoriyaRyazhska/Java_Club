//Task 7 (Beginner Series #2 Clock)

public class Clock
{
  public static int Past(int h, int m, int s)
  {
    m += h*60;
    s += m*60;
    return s*1000;
  }
}
