package com.team4;
public class Task46{
	
	public static void solution(String str) {
	    // Your code here...
	    String newcad="";
	    
	    for(int i = str.length()-1; i >= 0; i--){
	      newcad += str.charAt(i);
	    }
	    
	    System.out.println(newcad);
	  }
	public static void execute() {
	      System.out.println("Print a text: ");
	      String s = MyMain.scanner.nextLine();
	      solution(s);
	}
	
}
