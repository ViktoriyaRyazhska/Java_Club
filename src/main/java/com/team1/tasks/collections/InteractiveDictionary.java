package com.team1.tasks.collections;

import java.util.HashMap;
import java.util.Map;

public class InteractiveDictionary {
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
}
