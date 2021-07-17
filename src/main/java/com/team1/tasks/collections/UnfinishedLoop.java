package com.team1.tasks.collections;

import com.team1.IRunTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnfinishedLoop implements IRunTask {

    private int size;

    Scanner sc;
    public UnfinishedLoop(Scanner sc) {
        this.sc = sc;

    }

    public static List createList(int number)
    {
        List list = new ArrayList();

        for(int count = 1; count <= number;)
        {
            list.add(count);
            count++;
        }

        return list;
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input to size of list!");
        do {
            try {
                size = sc.nextInt();
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(createList(size));

    }
}
