package com.team1.tasks.OOP.subclasses;

public class God {
    private God() {
    }

    public static Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }
}

