package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class OppositesAttract implements IRunTask {
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 1 && flower2 % 2 == 0) || (flower1 % 2 == 0 && flower2 % 2 == 1);
    }

    @Override
    public void execute() {

    }
}
