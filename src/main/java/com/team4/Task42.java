package com.team4;
public class Task42 {

public static void TwiceAsOld(int dadYears, int sonYears){
	
    int twice = sonYears * 2;
    
    if(twice > dadYears) System.out.println(sonYears - (dadYears - sonYears));
    else System.out.println(sonYears - (dadYears - sonYears));
  
}


public static void execute() {
	 System.out.println("Enter fathers age: ");
	 int dadYears = MyMain.scanner.nextInt();
	 System.out.println("Enter sons age: ");
	 int sonYears = MyMain.scanner.nextInt();
	 TwiceAsOld(dadYears, sonYears);
}
}
