package com.team1.tasks.string;

import com.team1.IRunTask;

public class OppositeNumStr implements IRunTask {
    private OppositeNumStr() {
    }

    public static int opposite(int number) {
        return -number;
    }

    @Override
    public void execute() {

    }
}
