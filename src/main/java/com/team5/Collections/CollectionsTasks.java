package com.team5.Collections;

import com.team5.Menu.Input;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTasks {
    public List<String> task69(){
        System.out.println("The most incomprehensible task ...... I don't understand what they want from me, but keep the array");
        List<String> items = new ArrayList<>();
        items.add("an object");
        items.add("an object 1");
        items.add("an object 2");

        System.out.println(items);
        return items;
    }

    public List task70(int number){
        List list = new ArrayList<>();

        for(int count = 1; count <= number; count++)
        {
            list.add(count);
        }

        return list;
    }

    public void task70IO(){
        System.out.println("Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!");
        System.out.println("Enter the number");
        int number = Input.getIntegerInput();

        System.out.println(task70(number));
    }

    public List task71(){
        System.out.print("Enter array size - ");

        int n = Input.getIntegerInput();
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            System.out.print("Enter array elem - ");
            listOfNumbers.add(Input.getIntegerInput());
        }

        List<Integer> toRemove = new ArrayList<>();
        for (int i : listOfNumbers) {
            if (i % 2 == 0) { toRemove.add(i); }
        }
        listOfNumbers.removeAll(toRemove);
        System.out.println(listOfNumbers);
        return listOfNumbers;
    }
}
