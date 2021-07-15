package com.team1.tasks.collections;

import com.team1.IRunTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InteractiveDictionary implements IRunTask {
    private Map<String,String> listOfWords = new HashMap<String, String>();

    public InteractiveDictionary() {
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

    }
}

