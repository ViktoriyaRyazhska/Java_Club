//Task 20 (Convert a Boolean to a String)
package com.team4;
public class Task20 {
  public static String convert(boolean b){
    if(b == true) {
      return "true";
    } else {
      return "false";
    }
  }

  public static void execute(){
    System.out.println("Input your boolean(true or false) ");
    boolean n32 = MyMain.scanner.nextBoolean();
    System.out.println(Task20.convert(n32));
  }
}
