package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class DoIGetBonus implements IRunTask {

    Scanner sc;

    private  int salary;
    private boolean bonus;

    public DoIGetBonus(Scanner sc) {
        this.sc = sc;
    }

    public static String bonusTime(final int salary, final boolean bonus) {

        if (bonus) {
            return String.format("£%d", salary * 10);
        }

        return String.format("£%d", salary);
    }

    @Override
    public void execute() {
        boolean mark = false;
        int b;
        System.out.println("Input true(1) or false(0) to check the salary bonus! ");
        do {
            try {
                b = sc.nextInt();
                if(b==1){bonus=true;}
                else bonus=false;
                System.out.println("Input salary");
                salary = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(bonusTime(salary,bonus));
    }
}
