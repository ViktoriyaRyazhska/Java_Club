package com.team1;

import com.team1.tasks.basicTasks.*;
import com.team1.tasks.classesTasks.Fraction;
import com.team1.tasks.classesTasks.LombokEncapsulation;
import com.team1.tasks.classesTasks.StaticElectrickery;
import com.team1.tasks.conditionsTasks.*;

import java.util.Scanner;

public class Menu {

    public void menu(int task, Scanner sc) {
        switch (task) {
            case 1: System.out.println("You chose task 1");BasicTask1 basicTask1 = new BasicTask1();basicTask1.execute();break;
            case 2: System.out.println("You choose task 2");BasicTask2 basicTask2 = new BasicTask2();basicTask2.execute();break;
            case 3: System.out.println("You choose task 3");BasicTask3 basicTask3 = new BasicTask3();basicTask3.execute();break;
            case 4: System.out.println("You choose task 4");BasicTask4 basicTask4 = new BasicTask4();basicTask4.execute();break;
            case 5: System.out.println("You choose task 5");BasicTask5 basicTask5 = new BasicTask5();basicTask5.execute();break;
            case 6: System.out.println("You choose task 6");BasicTask6 basicTask6 = new BasicTask6();basicTask6.execute();break;
            case 7: System.out.println("You choose task 7");BasicTask7 basicTask7 = new BasicTask7();basicTask7.execute();break;
            case 8: System.out.println("You choose task 8");BasicTask8 basicTask8 = new BasicTask8();basicTask8.execute();break;
            case 9: System.out.println("You choose task 9");BasicTask9 basicTask9 = new BasicTask9();basicTask9.execute();break;
            case 10: System.out.println("You choose task 10");BasicTask10 basicTask10 = new BasicTask10();basicTask10.execute();break;
            case 11: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
            case 12: System.out.println("You choose task 12");Fraction fraction = new Fraction(); fraction.execute();break;
            case 13: System.out.println("You choose task 13");LombokEncapsulation lombokEncapsulation=new LombokEncapsulation();lombokEncapsulation.execute();break;
            case 14: System.out.println("You choose task 14");StaticElectrickery staticElectrickery = new StaticElectrickery();staticElectrickery.execute();break;
            case 15: System.out.println("You choose task 15");OppositeNum oppositeNum=new OppositeNum();oppositeNum.execute();break;
            case 16: System.out.println("You choose task 16");IsDivisible isDivisible=new IsDivisible();isDivisible.execute();break;
            case 17: System.out.println("You choose task 17");ConvertBoolToString convertBoolToString=new ConvertBoolToString();convertBoolToString.execute();break;
            case 18: System.out.println("You choose task 18");DoIGetBonus doIGetBonus=new DoIGetBonus(); doIGetBonus.execute();break;
            case 19: System.out.println("You choose task 19");HowOldInFuture howOldInFuture=new HowOldInFuture();howOldInFuture.execute();break;
            case 20: System.out.println("You choose task 20");RockPaperScissors rockPaperScissors=new RockPaperScissors();rockPaperScissors.execute();break;
            case 21: System.out.println("You choose task 21");MathOperations mathOperations=new MathOperations();mathOperations.execute();break;
//            case 22: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 23: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 24: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 25: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 26: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 27: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 28: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 29: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 30: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 31: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 32: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 33: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 34: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 35: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 36: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
//            case 37: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11();basicTask11.execute();break;
            default: System.out.println("There is no" + task + "task in this group");task = -1;break;
        }

    }

    public void printListOfTasks() {
        System.out.println("Input number of task!");
        System.out.println("Choose the task:" + "\nTask1  Press 1,"
                + " Task2 Press 2,"
                + " Task3 Press 3,"
                + " Task4 Press 4,"
                + "\nTask5 Press 5,"
                + " Task6 Press 6,"
                + " Task7 Press 7,"
                + " Task8 Press 8,"
                + "\nTask9 Press 9,"
                + " Task10 Press 10,"
                + " Task11 Press 11,"
                + "\nTask12 Press 12" +
                " Task13 Press 13" +
                " Task14 Press 14" +
                "\nTask15 Press 15" +
                " Task16 Press 16" +
                " Task17 Press 17" +
                "\nTask18 Press 18" +
                " Task19 Press 19" +
                " Task20 Press 20" +
                "\nTask21 Press 21" +
                " Task22 Press 22" +
                "Task23 Press 23" +
                "\nTask24 Press 24" +
                " Task25 Press 25" +
                " Task26 Press 26" +
                "\nTask27 Press 27" +
                " Task28 Press 28" +
                " Task29 Press 29" +
                "\nTask30 Press 30" +
                " Task31 Press 31" +
                " Task32 Press 32" +
                "\nTask33 Press 33" +
                " Task34 Press 34" +
                " Task35 Press 35" +
                "\nTask36 Press 36" +
                " Task37 Press 37");
    }
}
