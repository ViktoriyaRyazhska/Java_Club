//Task 32 (String repeat)
package com.team4;
public class Task32 {
    public static String repeatStr(final int repeat, final String string) {
      if(repeat == 0)
        return "";
      String ans = string;
      for(int i = 1; i < repeat; i++)
        ans += string;
        return ans;
    }

    public static void execute(){
        System.out.println("Input repeat of your word(int) and your word");
        int n52 = MyMain.scanner.nextInt();
        String n53 = MyMain.scanner.nextLine();
        System.out.println(Task32.repeatStr(n52, n53));
    }
}
