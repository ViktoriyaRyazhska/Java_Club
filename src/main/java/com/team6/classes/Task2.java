package com.team6.classes;

class Task2 {
    public static final Task2 INST = new Task2();

    private static int ONE_HUNDRED = 100;

    private  int value;

    private Task2() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

}
