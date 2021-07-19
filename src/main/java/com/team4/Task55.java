package com.team4;
public class Task55 {

public static void howOld(final String herOld) {

	  //your code here, return correct age as int ; )
	    char[] chr = herOld.toCharArray();
	    String s = "" +chr[0];
	    System.out.println(s);
	  
	  }
public static void execute() {
	System.out.println("how old is her ");
	String h = MyMain.sc.nextLine();
	howOld(h);
}
}
