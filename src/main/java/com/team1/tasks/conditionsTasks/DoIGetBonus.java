package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class DoIGetBonus implements IRunTask {

    public DoIGetBonus() {
        //no args
    }

    public static String bonusTime(final int salary, final boolean bonus) {

        if (bonus) {
            return String.format("£%d", salary * 10);
        }

        return String.format("£%d", salary);
    }

    @Override
    public void execute() {
        System.out.println(bonusTime(1500,true));
    }
}
