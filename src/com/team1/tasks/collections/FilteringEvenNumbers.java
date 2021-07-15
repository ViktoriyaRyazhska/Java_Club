package com.team1.tasks.collections;

import com.team1.IRunTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilteringEvenNumbers implements IRunTask {

    List<Integer> listOfNumbers = new ArrayList<>();
    public FilteringEvenNumbers() {
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
    }

    @Override
    public void execute() {
        boolean mark = false;
        System.out.println("Input to integer temperature you want to convert to fahrenheit !");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                for (int i = 0; i <size; i++) {
                    int number = sc.nextInt();
                    listOfNumbers.add(number);
                }
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);
        System.out.println(filterOddNumber(listOfNumbers));
    }
}
