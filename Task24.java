//Task 24 (Basic Mathematical Operations)

public class BasicOperations{
  public static Integer basicMath(String symbol, int x, int y){
    switch (symbol){
      case "+": return x+y;
      case "-": return x-y;
      case "*": return x*y;
      case "/": return x/y;
    }
    return 0;
  }
}
