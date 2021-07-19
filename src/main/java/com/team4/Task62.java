package com.team4;

public class Task62{
	
	public static String toAlternativeString(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }
	
	public static void execute() {
		System.out.println("Enter a text: ");
		String s = MyMain.sc.nextLine();
		String altern = toAlternativeString(s); System.out.println(altern);
	}
}
