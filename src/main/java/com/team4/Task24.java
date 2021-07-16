//Task 24 (Basic Mathematical Operations)
package com.team4;
public class Task24{
  public static Integer basicMath(String symbol, int x, int y){
    switch (symbol){
      case "+": return x+y;
      case "-": return x-y;
      case "*": return x*y;
      case "/": return x/y;
    }
    return 0;
  }

  public static void execute(){ }
}
