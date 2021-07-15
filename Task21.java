//Task 21 (Do I get a bonus?)

public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    String s = "£";
    if(bonus == true)
      s+=Integer.toString(salary*10);
    else
      s+=Integer.toString(salary);
    return s;
  }
}
