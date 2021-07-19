package com.team4;
public class Task57 {

	public static void abbrevName(String name) {
	    String s = (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
	    System.out.println(s);
	  }
	public static void execute() {
		System.out.println("Enter your name: "); String name = MyMain.sc.nextLine();
		abbrevName(name);
	}
}
