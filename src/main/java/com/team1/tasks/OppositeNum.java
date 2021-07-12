package com.team1.tasks;

public class OppositeNum {
    private OppositeNum() {
    }

    public static int opposite(int number) {
        int opposite = 0;
        if (number < 0) {
            opposite = number + (number * 2);
            return opposite;
        } else if (number == 0) return opposite;
        else {
            opposite = number - (number * 2);
            return opposite;
        }
    }
}
