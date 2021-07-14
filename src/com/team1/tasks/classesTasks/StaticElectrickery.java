package com.team1.tasks.classesTasks;

public class StaticElectrickery {
    public static final StaticElectrickery INST = new StaticElectrickery();
    private final int value;
    private final int ONE_HUNDRED = 100;

    private StaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
