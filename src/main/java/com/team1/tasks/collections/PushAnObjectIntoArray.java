package com.team1.tasks.collections;

import com.team1.IRunTask;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PushAnObjectIntoArray implements IRunTask {

    Scanner sc;
    public PushAnObjectIntoArray(Scanner sc) {
        this.sc = sc;

    }

    public static List<String> push() {
        return Arrays.asList("an object");
    }

    @Override
    public void execute() {
        System.out.println(push());
    }
}
