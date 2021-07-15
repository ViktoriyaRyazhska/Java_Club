package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class DoIGetAbonus implements IRunTask {

    public DoIGetAbonus() {
    }

    public static String bonusTime(final int salary, final boolean bonus) {

        if (bonus) {
            return String.format("£%d", salary * 10);
        }

        return String.format("£%d", salary);
    }

    @Override
    public void execute() {

    }
}
