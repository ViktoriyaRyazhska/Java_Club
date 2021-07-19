package com.team4;
public class Task52 {

	public static void tripleTrouble(String s1, String s2, String s3) {
	    StringBuilder sb = new StringBuilder(s1.length()*3);
	    for (int i=0; i<s1.length(); i++) {
	      sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
	    }
	    String s = sb.toString();
	    System.out.println(s);
}
	
	public static void execute() {
		System.out.println("Enter three words: ");
		String s1 = MyMain.sc.nextLine();
		String s2 = MyMain.sc.nextLine();
		String s3 = MyMain.sc.nextLine();
		tripleTrouble(s1, s2, s3);
	}
}
