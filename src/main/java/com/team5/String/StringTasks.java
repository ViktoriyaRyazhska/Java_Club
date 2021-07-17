package com.team5.String;

public class StringTasks {

    public int task9(String alphabet){
        char e = alphabet.charAt(0);
        int ascii = e;
        System.out.println(ascii);
        return ascii;
    }

    public String task10(String num){
        String[] c = num.split("");
        if(num.isEmpty()){
            System.exit(0);
        }
        for (int i = 0; i < c.length; i++) {
            try {

                if (Integer.parseInt(c[i]) < 5) {
                    c[i] = String.valueOf(0);
                } else if (Integer.parseInt(c[i]) >= 5) {
                    c[i] = String.valueOf(1);
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect value");
            }
        }
        String result = String.join("", c);
        System.out.println(result);
        return result;
    }

    public int task11(String years){
        String[] strings = years.split(" ");
        int year = Integer.parseInt(strings[0]);
        System.out.println(year);
        return year;
    }

    public static void task12(int temp) {
        int c =  convert(temp);
        if (c > 0)
            System.out.println(c + " is freezing temperature");
        else
            System.out.println(c +  " is freezing temperature");
    }

    // До таску 12
    public static int convert(double temperature) {
        int celsius = (int) ((temperature - 32.0) * (5.0/9.0));
        return celsius;
    }

    public static String task13(String name) {
        String[] arr = name.split(" ");
        String[] nameArr = arr[0].split("");
        String[] surnameArr = arr[1].split("");
        String initials = String.join(".",  nameArr[0],surnameArr[0]);
        System.out.println(initials.toUpperCase());
        return initials.toUpperCase();
    }

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
