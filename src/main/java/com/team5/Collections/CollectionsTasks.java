package com.team5.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTasks {
    public List<String> task1(){
        System.out.println("The most incomprehensible task ...... I don't understand what they want from me, but keep the array");
        List<String> items = new ArrayList<>();
        items.add("an object");
        items.add("an object 1");
        items.add("an object 2");

//            for(String a : items){
//                System.out.println(a);
//            }

        System.out.println(items);
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
