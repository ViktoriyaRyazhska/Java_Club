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
    public void task55(String str) {
        System.out.println(str.replace(".", "-"));
    }
    public void task56 (String name) {
        String s = Character.toString(name.charAt(0));
        System.out.println(s.toLowerCase().equals("r") ? name + " plays banjo" : name + " does not play banjo");
    }
    public void task57(String x) {
        System.out.println(x.replace(" ", ""));
    }
    public void task58(String one, String two, String three) {
        String res="";
        for(int i=0;i<one.length();i++){
            res+=Character.toString(one.charAt(i))+Character.toString(two.charAt(i))+Character.toString(three.charAt(i));
        }
        System.out.println(res);
    }

}
