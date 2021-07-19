package com.team4;
public class Task50 {

public static void areYouPlayingBanjo(String name) {
    // Program me!
    char[] chr = name.toCharArray();
    if(chr[0] == 'r' || chr[0] == 'R') System.out.println(name + " plays banjo");
    else System.out.println(name + " does not play banjo");
    
}

public static void execute() {
	System.out.print("Enter your name: ");
	String s = MyMain.sc.nextLine();
	areYouPlayingBanjo(s);
}
}
