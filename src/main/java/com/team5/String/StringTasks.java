package com.team5.String;

import com.team5.Menu.Input;

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

    public int task14() {
        System.out.println("Enter the line with the first argument, and the second the letter you want to find in the word," +
                " the method will say how many times this letter occurred in the line");
        String str = Input.getStrInput();
        char letter = Input.getCharInput();
        int temp = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == letter){
                temp++;
            }
        }

        System.out.println(temp);
        return temp;
    }

    public String task15() {
        System.out.println("Enter 3 lines, this method will sort them alphabetically and return the first value, " +
                "this value will have a \"***\" between each of its letters");

        String[] s = new String[3];
        s[0] = Input.getStrInput();
        s[1] = Input.getStrInput();
        s[2] = Input.getStrInput();
        java.util.Arrays.sort(s);

        String result = String.join("***",s[0].split(""));

        System.out.println(result);
        return result;
    }

    public String task16() {
        System.out.println("Enter any text, this program will replace \"5\" with \"S\", \"0\" with \"O\" and \"1\" with \"I\"");
        String string = Input.getStrInput();
        String result = string.replace("5", "S").replace("0", "O").replace("1", "I");
        System.out.println(result);
        return result;
    }

    public String task17() {
        System.out.println("Enter any line, this program changes uppercase letters to lowercase and lowercase to uppercase");
        String string = Input.getStrInput();
        String result = "";

        for (int i = 0; i < string.length(); i++){
            if (Character.isUpperCase(string.charAt(i))){
                result += Character.toLowerCase(string.charAt(i));
            }else result += Character.toUpperCase(string.charAt(i));
        }

        System.out.println(result);
        return result;
    }

    public String task18(){
        System.out.println("First enter any line, then the number of exclamation marks, " +
                "how many you want to delete in this line from left to right");
        String s = Input.getStrInput();
        int n = Input.getIntegerInput();

        while (n-- > 0)
            s = s.replaceFirst("!", "");

        System.out.println(s);
        return s;
    }
    public String task55() {
        System.out.print("Enter string with dots - ");
        String str = Input.getStrInput();
        System.out.println(str.replace(".", "-"));
        return str.replace(".", "-");
    }
    public String task56 () {
        System.out.print("Enter name - ");
        String name = Input.getStrInput();
        String s = Character.toString(name.charAt(0));
        System.out.println(s.toLowerCase().equals("r") ? name + " plays banjo" : name + " does not play banjo");
        return s.toLowerCase().equals("r") ? name + " plays banjo" : name + " does not play banjo";
    }
    public String task57() {
        System.out.print("Enter Sting with spaces - ");
        String str = Input.getStrInput();
        System.out.println(str.replace(" ", ""));
        return str.replace(" ", "");
    }
    public String task58() {
        System.out.println("Enter Sting with same num of elem");
        System.out.print("Enter str1 - ");
        String one = Input.getStrInput();
        System.out.print("Enter str2 - ");
        String two = Input.getStrInput();
        System.out.print("Enter str3 - ");
        String three = Input.getStrInput();
        String res="";
        for(int i=0;i<one.length();i++){
            res+=Character.toString(one.charAt(i))+Character.toString(two.charAt(i))+Character.toString(three.charAt(i));
        }
        System.out.println(res);
        return res;
    }

}
