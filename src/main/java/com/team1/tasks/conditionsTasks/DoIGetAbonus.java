package com.team1.tasks.conditionsTasks;

public class DoIGetAbonus {

    public DoIGetAbonus() {
    }

    public static String bonusTime(final int salary, final boolean bonus) {

        if (bonus) {
            return String.format("£%d", salary * 10);
        }

        return String.format("£%d", salary);
    }
}
