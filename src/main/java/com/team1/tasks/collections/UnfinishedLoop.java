package com.team1.tasks.collections;

import com.team1.IRunTask;

import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoop implements IRunTask {


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

    @Override
    public void execute() {

    }
}
