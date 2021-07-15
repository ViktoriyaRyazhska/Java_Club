package com.team1.tasks.classesTasks;

import com.team1.IRunTask;

public class StaticElectrickery implements IRunTask {
    public static final StaticElectrickery INST = new StaticElectrickery();
    private final int value;
    private final int ONE_HUNDRED = 100;

    public StaticElectrickery() {
        value = ONE_HUNDRED;
    }


    public int plus100(int n) {
        return value + n;
    }

    @Override
    public void execute() {
        plus100(10);
    }
}
