package com.team5.String;

import com.team5.Menu.Input;

public class StringTasks {

    public int task59(){
        System.out.println("When provided with a letter, return its position in the alphabet.");
        System.out.println("Enter your char");
        char e = Input.getCharInput();
        int ascii = e;
        System.out.println(ascii);
        return ascii;
    }

    public String task60(){
        System.out.println("Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and " +
                "above with '1'. Return the resulting string.");
        System.out.println("Enter your numbers");
        String num = Input.getStrInput();
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

    public int task61(){
        System.out.println("Ask a small girl - \"How old are you?\". She always says strange things... Lets help her!");
        System.out.println("Enter years");
        String years = Input.getStrInput();
        String[] strings = years.split(" ");
        int year = Integer.parseInt(strings[0]);
        System.out.println(year);
        return year;
    }

    public void task62() {
        System.out.println("Enter your temperature");
        int temp = Input.getIntegerInput();
        int c =  convert(temp);
        if (c > 0)
            System.out.println(c + " is freezing temperature");
        else
            System.out.println(c +  " is freezing temperature");
    }

    // До таску 12
    public int convert(double temperature) {
        int celsius = (int) ((temperature - 32.0) * (5.0/9.0));
        return celsius;
    }

    public String task63() {
        System.out.println("Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.");
        System.out.println("Enter the name");
        String name = Input.getStrInput();
        String[] arr = name.split(" ");
        String[] nameArr = arr[0].split("");
        String[] surnameArr = arr[1].split("");
        String initials = String.join(".",  nameArr[0],surnameArr[0]);
        System.out.println(initials.toUpperCase());
        return initials.toUpperCase();
    }

    public int task64() {
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

    public String task65() {
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

    public String task66() {
        System.out.println("Enter any text, this program will replace \"5\" with \"S\", \"0\" with \"O\" and \"1\" with \"I\"");
        String string = Input.getStrInput();
        String result = string.replace("5", "S").replace("0", "O").replace("1", "I");
        System.out.println(result);
        return result;
    }

    public String task67() {
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

    public String task68(){
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
