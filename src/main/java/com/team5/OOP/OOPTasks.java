package com.team5.OOP;

import com.team5.Menu.Input;

public class OOPTasks {

    public String task49(){
        System.out.println("Enter your string for encoding");
        String source = Input.getStrInput();

        String[] charArr = source.split("");
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == null){
                charArr[i] = "";
            }
            if(charArr[i].equalsIgnoreCase("a")){
                charArr[i] = "4";
            } else if(charArr[i].equalsIgnoreCase("e")){
                charArr[i] = "3";
            }else if(charArr[i].equalsIgnoreCase("l")){
                charArr[i] = "1";
            }else if(charArr[i].equalsIgnoreCase("m")){
                charArr[i] = "//^^\\" ;
            }else if(charArr[i].equalsIgnoreCase("o")){
                charArr[i] = "0";
            }else if(charArr[i].equalsIgnoreCase("u")){
                charArr[i] = "(_)";
            }
        }
        String str = String.join("", charArr);
        System.out.println(str);
        return str;
    }
}
