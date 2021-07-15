package com.team6.basic.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Task3 {
    public static List<Integer> filterOnNumber(List<Integer> list){
        for (int i = 0 ; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
