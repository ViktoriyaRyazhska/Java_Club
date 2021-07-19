//Task 26 (Convert boolean values to strings 'Yes' or 'No'.)
package com.team4;
class Task26
{
  public static String boolToWord(boolean b)
  {
    if(b == true)
      return "Yes";
    else
      return "No";
  }

  public static void execute(){
    System.out.println("Input your boolean(true or false) ");
    boolean n44 = MyMain.scanner.nextBoolean();
    System.out.println(Task26.boolToWord(n44));
  }
}
