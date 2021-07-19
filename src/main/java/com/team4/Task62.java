package com.team4;

public class Task62{
	
	public static void toAlternativeString(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        System.out.println(result);
    }
	
	public static void execute() {
		System.out.println("Enter a text: ");
		String s = MyMain.scanner.nextLine();
		toAlternativeString(s);
	}
}
