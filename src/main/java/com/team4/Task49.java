package com.team4;
public class Task49{

	  public static String replaceDots(final String str) {
	    String s = str.replace(".", "-");
	    return s;
	  }
	  
	  public static void execute() {
		  System.out.println("Enter something: ");
		  String s = MyMain.sc.nextLine();
		  String dots = replaceDots(s); System.out.println(dots);
	  }
}
