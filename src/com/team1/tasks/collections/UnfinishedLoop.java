package com.team1.tasks.collections;

import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoop {


    public UnfinishedLoop() {

    }

    public static List CreateList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number;)
        {
            list.add(count);
            count++;
        }

        return list;
    }
}
