package com.team4;
public class Task42 {

public static int TwiceAsOld(int dadYears, int sonYears){
	
    int twice = sonYears * 2;
    
    return twice > dadYears ? sonYears - (dadYears - sonYears) : dadYears - twice;
  
}


public static void execute() {
	 System.out.println("Enter fathers age: ");
	 int dadYears = MyMain.scanner.nextInt();
	 System.out.println("Enter sons age: ");
	 int sonYears = MyMain.scanner.nextInt();
	 int twice = TwiceAsOld(dadYears, sonYears);
	 System.out.println(twice);
}
}
