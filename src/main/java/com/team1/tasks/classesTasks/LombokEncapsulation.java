package com.team1.tasks.classesTasks;

import com.team1.IRunTask;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Scanner;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LombokEncapsulation implements IRunTask {
    private int number;
    private String stringValue;


    @Override
    public String toString() {
        return "LombokEncapsulation{" +
                "number=" + number +
                ", stringValue='" + stringValue + '\'' +
                '}';
    }

    @Override
    public void execute() {
        boolean mark = false;
        LombokEncapsulation lombokEncapsulation;
        LombokEncapsulation lombokEncapsulation2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lombok test");
        do {
            try {



                lombokEncapsulation = new LombokEncapsulation();
                number = sc.nextInt();

                System.out.println("Input some number");

                System.out.println("Input some string");

                stringValue = sc.next();

                lombokEncapsulation2 = new LombokEncapsulation(number,stringValue);
                lombokEncapsulation.setNumber(number);
                lombokEncapsulation.setStringValue(stringValue);
                System.out.println(lombokEncapsulation.toString()+" "+ lombokEncapsulation2);
                mark = true;
            } catch (Exception exception) {
                System.out.println("You have input illegal character, try again!");
                continue;
            }
        } while (mark == false);

    }
}
