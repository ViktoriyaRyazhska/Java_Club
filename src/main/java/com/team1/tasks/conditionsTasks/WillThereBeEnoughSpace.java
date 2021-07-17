package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class WillThereBeEnoughSpace implements IRunTask {
    public static int enough(int cap, int on, int wait) {
        if ((on + wait) > cap) {
            return (on + wait) - cap;
        } else return 0;
    }

    @Override
    public void execute() {
        //TODO: add realisation
    }
}
