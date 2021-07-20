package com.team1.tasks.OOP.subclasses;

import com.team1.IRunTask;

import java.util.Arrays;

public class God implements IRunTask {
    public God() {
        //no args
    }

    public static Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }

    @Override
    public void execute() {
        System.out.println(Arrays.toString(create()));
    }
}

