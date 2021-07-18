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

  public static void execute(){
    System.out.println("Input +, -, / or *, and two numbers ");
    String n39 = MyMain.scanner.nextLine();
    int n40 = MyMain.scanner.nextInt();
    int n41 = MyMain.scanner.nextInt();
    System.out.println(Task24.basicMath(n39, n40, n41));
  }
}
