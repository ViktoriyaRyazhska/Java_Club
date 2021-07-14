package com.team5.String;

public class StringTasks {

    public int task14(String str, char letter) {

        int temp = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == letter){
                temp++;
            }
        }

        return temp;
    }

    public String task15(String[] s) {
        java.util.Arrays.sort(s);
        return String.join("***",s[0].split(""));
    }

    public String task16(String string) {
        return string.replace("5", "S").replace("0", "O").replace("1", "I");
    }

    public String task17(String string) {

        String result = "";

        for (int i = 0; i < string.length(); i++){
            if (Character.isUpperCase(string.charAt(i))){
                result += Character.toLowerCase(string.charAt(i));
            }else result += Character.toUpperCase(string.charAt(i));
        }

        return result;
    }

    public String task18(String s, int n){

        while (n-- > 0)
            s = s.replaceFirst("!", "");

        return s;
    }

}
