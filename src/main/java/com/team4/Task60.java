package com.team4;
public class Task60 {

	public static String remove(String s, int n){
		  
	    while(n-->0)
	      s  = s.replaceFirst("!","");   
	    return s;    
	  }
	public static void execute() {
		System.out.println("Enter a text");
		String s = MyMain.sc.nextLine();
		System.out.println("Print a number");
		int n = MyMain.scanner.nextInt();
		String rem = remove(s, n); System.out.println(rem);
	}
	
}
