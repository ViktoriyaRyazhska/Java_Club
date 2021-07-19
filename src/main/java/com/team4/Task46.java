package com.team4;
public class Task46{
	
	public static String solution(String str) {
	    // Your code here...
	    String newcad="";
	    
	    for(int i = str.length()-1; i >= 0; i--){
	      newcad += str.charAt(i);
	    }
	    
	    return newcad;
	  }
	public static void execute() {
	      System.out.println("Print a text: ");
	      String s = MyMain.sc.nextLine();
	      String sol = solution(s);
		  System.out.println(sol);
	}
	
}
