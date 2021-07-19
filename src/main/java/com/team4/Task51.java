package com.team4;
public class Task51 {
	
	public static String noSpace(final String x) {
        String s = "";
      char[] chr = x.toCharArray();
      for(int i = 0; i != chr.length; i++){
        if(chr[i] != ' ') s += chr[i];
      }
      return s;
    }
	
	public static void execute() {
	 System.out.print("Enter some text: ");
	 String s = MyMain.sc.nextLine();
	 String space = noSpace(s);
	 System.out.println(space);
	}
}
