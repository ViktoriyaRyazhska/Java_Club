package com.team1.tasks.collections;

import com.team1.IRunTask;

import java.util.Arrays;
import java.util.List;

public class PushAnObjectIntoArray implements IRunTask {
    public PushAnObjectIntoArray() {
        //no args
    }

    public static List<String> push() {
        return Arrays.asList("an object");
    }

    @Override
    public void execute() {
        System.out.println(push());
    }
}
