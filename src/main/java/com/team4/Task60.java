package com.team4;
public class Task60 {

	public static void remove(String s, int n){
		  
	    while(n-->0)
	      s  = s.replaceFirst("!","");   
	    System.out.println(s);    
	  }
	public static void execute() {
		System.out.println("Enter a text");
		String s = MyMain.scanner.nextLine();
		System.out.println("Print a number");
		int n = MyMain.scanner.nextInt();
		remove(s, n);
	}
	
}
