package com.team1.tasks.conditionsTasks;

import com.team1.IRunTask;

import java.util.Scanner;

public class ConvertBoolToString implements IRunTask {


    private int b;
    boolean bb;
    Scanner sc;
    public ConvertBoolToString(Scanner sc) {
        this.sc = sc;
    }

    public static String convert(boolean b) {
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input true(1) or false(0) to convert it to string !");
        do {
            try {
                b = sc.nextInt();
                if(b==1){bb=true;}
                else bb=false;
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(convert(bb));
    }
}
