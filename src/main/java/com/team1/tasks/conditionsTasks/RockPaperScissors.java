package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class RockPaperScissors implements IRunTask {

    Scanner sc;
    public RockPaperScissors(Scanner sc) {
        this.sc = sc;
    }

    private String p1;
    private String p2;

    public static String rps(String p1, String p2) {
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
        boolean mark = false;
        System.out.println("Rock scissors paper" +
                "Input rock, scissors or paper");
        do {
            try {
                System.out.println("First player");
                p1 = sc.next();
                System.out.println("Second player");
                p2 = sc.next();

                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(rps(p1,p2));
    }
}
