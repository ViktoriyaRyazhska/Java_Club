package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

public class RockPaperScissors implements IRunTask {
    private RockPaperScissors() {
    }

    public static String rps(String p1, String p2) {
        // your code
        if ((p1.equals("scissors") && p2.equals("paper"))
                || (p1.equals("rock") && p2.equals("scissors"))
                || (p1.equals("paper") && p2.equals("rock"))) {
            return "Player 1 won!";
        } else if (p1.equals(p2)) {
            return "Draw!";
        } else {
            return "Player 2 won!";
        }
    }

    @Override
    public void execute() {

    }
}
