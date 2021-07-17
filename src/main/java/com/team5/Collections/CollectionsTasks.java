package com.team5.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTasks {
    public List<String> task1(String str){
        List<String> items = new ArrayList<>();
        items.add("an object");
        items.add(str);
            for(String a : items){
                System.out.println(a);
            }
        return items;
    }
    public static void task71(int n, List<Integer> listOfNumbers){

        List<Integer> toRemove = new ArrayList<>();
        for (int i : listOfNumbers) {
            if (i % 2 == 0) { toRemove.add(i); }
        }
        listOfNumbers.removeAll(toRemove);
        System.out.println(listOfNumbers);
    }
}
