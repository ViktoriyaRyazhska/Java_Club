package com.team4;
public class Task57 {

	public static String abbrevName(String name) {
	    String s = name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
	    return s;
	  }


	public static void execute() {
		System.out.println("Enter your name: "); String name = MyMain.sc.nextLine();

		String name = abbrevName(name); System.out.println(name);
	}

