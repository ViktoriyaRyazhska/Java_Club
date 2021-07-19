package com.team4;
public class Task52 {

	public static String tripleTrouble(String s1, String s2, String s3) {
	    StringBuilder sb = new StringBuilder(s1.length()*3);
	    for (int i=0; i<s1.length(); i++) {
	      sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
	    }
	    String s = sb.toString();
	    return s;
}
	
	public static void execute() {
		System.out.println("Enter three words: ");
		String s1 = MyMain.sc.nextLine();
		String s2 = MyMain.sc.nextLine();
		String s3 = MyMain.sc.nextLine();
		String triple = tripleTrouble(s1, s2, s3); System.out.println(triple);
	}
}
