package com.team6.basic.collections;

import java.util.ArrayList;
import java.util.List;

class Task2 {
    public static List createList(int number){
        List list = new ArrayList();
        for(int count = 1 ;  count <= number;count++){
            list.add(count);
        }
        return list;
    }
}
