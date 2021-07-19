package com.team4;
public class Task55 {

public static int howOld(final String herOld) {

	  //your code here, return correct age as int ; )
	    char[] chr = herOld.toCharArray();
        String s = "" +chr[0];
        return Integer.parseInt(s);
	  
	  }
public static void execute() {
	System.out.println("how old is her ");
	String h = MyMain.sc.nextLine();
	int age = howOld(h); System.out.println(age);
}
}
