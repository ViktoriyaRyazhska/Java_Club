package com.team4;
public class Task61 {

	public static String correct(String string) {
	    String s = string.replace("5","S").replace("0", "O").replace("1","I");
	    return s;
	  }
	
	public static void execute() {
		System.out.print("Enter a text: ");
		String s = MyMain.sc.nextLine();
		String cor = correct(s); System.out.println(cor);
	}
	
}
