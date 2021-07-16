package com.team1.tasks.collections;

import com.team1.IRunTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InteractiveDictionary implements IRunTask {
    private Map<String,String> listOfWords = new HashMap<String, String>();

    public InteractiveDictionary() {
        //no args
    }

    public void newEntry(String key, String value) {
        listOfWords.put(key,value);
    }

    public String look(String key) {
        if(listOfWords.get(key)==null){
            return "Cant find entry for "+key;
        }
        return listOfWords.get(key);
    }


    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input to integer temperature you want to convert to fahrenheit !");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input amount of words you want to add to the dictionary");
                int size = sc.nextInt();
                for (int i = 0; i <size; i++) {
                    System.out.println("Input word");
                    String key = sc.next();
                    System.out.println("Input description");
                    String value = sc.next();
                    newEntry(key,value);
                }
                while (true){
                    System.out.println("Input word you want to get description, press 0 to stop the program");
                    String key = sc.next();
                    look(key);
                    if (key =="0"){break;}
                }
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
    }
}

