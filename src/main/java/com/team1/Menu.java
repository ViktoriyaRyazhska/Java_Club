package com.team1;

import com.team1.tasks.OOP.subclasses.God;
import com.team1.tasks.basicTasks.*;
import com.team1.tasks.classesTasks.Fraction;
import com.team1.tasks.classesTasks.LombokEncapsulation;
import com.team1.tasks.classesTasks.StaticElectrickery;
import com.team1.tasks.collections.FilteringEvenNumbers;
import com.team1.tasks.collections.InteractiveDictionary;
import com.team1.tasks.collections.PushAnObjectIntoArray;
import com.team1.tasks.collections.UnfinishedLoop;
import com.team1.tasks.conditionsTasks.*;
import com.team1.tasks.loops.*;
import com.team1.tasks.string.Hello;
import com.team1.tasks.string.NumToStrConv;
import com.team1.tasks.string.OppositeNumStr;
import com.team1.tasks.string.StringReverser;

import java.util.Scanner;


public class Menu {

    public void menu(int task, Scanner sc) {
        switch (task) {
            case 1: System.out.println("You choose task 1");BasicTask1 basicTask1 = new BasicTask1(sc);basicTask1.execute();break;
            case 2: System.out.println("You choose task 2");BasicTask2 basicTask2 = new BasicTask2(sc);basicTask2.execute();break;
            case 3: System.out.println("You choose task 3");BasicTask3 basicTask3 = new BasicTask3(sc);basicTask3.execute();break;
            case 4: System.out.println("You choose task 4");BasicTask4 basicTask4 = new BasicTask4(sc);basicTask4.execute();break;
            case 5: System.out.println("You choose task 5");BasicTask5 basicTask5 = new BasicTask5(sc);basicTask5.execute();break;
            case 6: System.out.println("You choose task 6");BasicTask6 basicTask6 = new BasicTask6(sc);basicTask6.execute();break;
            case 7: System.out.println("You choose task 7");BasicTask7 basicTask7 = new BasicTask7(sc);basicTask7.execute();break;
            case 8: System.out.println("You choose task 8");BasicTask8 basicTask8 = new BasicTask8(sc);basicTask8.execute();break;
            case 9: System.out.println("You choose task 9");BasicTask9 basicTask9 = new BasicTask9(sc);basicTask9.execute();break;
            case 10: System.out.println("You choose task 10");BasicTask10 basicTask10 = new BasicTask10(sc);basicTask10.execute();break;
            case 11: System.out.println("You choose task 11");BasicTask11 basicTask11 = new BasicTask11(sc);basicTask11.execute();break;
            case 12: System.out.println("You choose task 12");Fraction fraction = new Fraction(); fraction.execute();break;
            case 13: System.out.println("You choose task 13");LombokEncapsulation lombokEncapsulation=new LombokEncapsulation();lombokEncapsulation.execute();break;
            case 14: System.out.println("You choose task 14");StaticElectrickery staticElectrickery = new StaticElectrickery(sc);staticElectrickery.execute();break;
            case 15: System.out.println("You choose task 15");FilteringEvenNumbers filteringEvenNumbers = new FilteringEvenNumbers(sc); filteringEvenNumbers.execute(); break;
            case 16: System.out.println("You choose task 16");InteractiveDictionary interactiveDictionary = new InteractiveDictionary(sc); interactiveDictionary.execute(); break;
            case 17: System.out.println("You choose task 17");PushAnObjectIntoArray pushAnObjectIntoArray = new PushAnObjectIntoArray(sc);  pushAnObjectIntoArray.execute(); break;
            case 18: System.out.println("You choose task 18");UnfinishedLoop unfinishedLoop = new UnfinishedLoop(sc); unfinishedLoop.execute(); break;
            case 19: System.out.println("You choose task 19");ConvertBoolToString convertBoolToString=new ConvertBoolToString(sc);convertBoolToString.execute();break;
            case 20: System.out.println("You choose task 20");DoIGetBonus doIGetBonus=new DoIGetBonus(sc); doIGetBonus.execute();break;
            case 21: System.out.println("You choose task 21");HowOldInFuture howOldInFuture=new HowOldInFuture(sc);howOldInFuture.execute();break;
            case 22: System.out.println("You choose task 22");IsDivisible isDivisible=new IsDivisible(sc);isDivisible.execute();break;
            case 23: System.out.println("You choose task 23");MathOperations mathOperations=new MathOperations(sc);mathOperations.execute();break;
            case 24: System.out.println("You choose task 24");OppositeNum oppositeNum = new OppositeNum(sc); oppositeNum.execute();break;
            case 25: System.out.println("You choose task 25");RockPaperScissors rockPaperScissors=new RockPaperScissors(sc);rockPaperScissors.execute();break;
            case 26: System.out.println("You choose task 26");Averages averages= new Averages(sc); averages.execute(); break;
            case 27: System.out.println("You choose task 27");CatDogYearsCounter catDogYearsCounter = new CatDogYearsCounter(sc); catDogYearsCounter.execute(); break;
            case 28: System.out.println("You choose task 28");ReversedSequence reversedSequence= new ReversedSequence(sc); reversedSequence.execute(); break;
            case 29: System.out.println("You choose task 29");SheepCounter sheepCounter = new SheepCounter(sc); sheepCounter.execute(); break;
            case 30: System.out.println("You choose task 30");StringRepeater stringRepeater = new StringRepeater(sc); stringRepeater.execute(); break;
            case 31: System.out.println("You choose task 31");Hello hello = new Hello(sc); hello.execute(); break;
            case 32: System.out.println("You choose task 32");NumToStrConv numToStrConv = new NumToStrConv(sc);numToStrConv.execute(); break;
            case 33: System.out.println("You choose task 33");OppositeNumStr oppositeNumStr = new OppositeNumStr(sc); oppositeNumStr.execute(); break;
            case 34: System.out.println("You choose task 34");StringReverser stringReverser = new StringReverser(sc); stringReverser.execute(); break;

            default: System.out.println("There is no" + task + "task in this group");task = -1;break;
        }

    }

    public void printListOfTasks() {
        System.out.println("Input number of task!");
        System.out.println("Choose the task:" + "\n01.Basic Task 1   "
                + "02.Basic Task 2   "
                + "03.Basic Task 3   "
                + "\n04.Basic Task 4   "
                + "05.Basic Task 5   "
                + "06.Basic Task 6   "
                + "07.Basic Task 7   "
                + "\n08.Basic Task 8   "
                + "09.Basic Task 9   "
                + "10.Basic Task 10   "
                + "11.Basic Task 11   "
                + "\n12.Fractions classes Task 12   " +
                " 13.Lombok encapsulation Task 13   " +
                " 14.Fixme Static Electrickery Task 14   " +
                "15.Filtering-even-numbers-bug-fixes Task15   " +
                "\n16.Interactive Dictionary Task16   " +
                "17.Push An Object Into Array Task17   " +
                "18.UnfinishedLoop Task18   " +
                "19.Convert Bool To String Task19   " +
                "\n20.Do I Get BonusTask20   " +
                "21.How-old-will-i-be-in-2099 Task21   " +
                "22.Is Divisible Task22   " +
                "23.Math Operations Task23   " +
                "\n24.Opposite Num Task24   " +
                "25.RockPaperScissors Task25   " +
                "26.Averages Task26   " +
                "27.CatDog Years CounterTask27   " +
                "\n28.Reversed Sequence Task28   " +
                "29.Sheep Counter Task29   " +
                "30.StringRepeater Task30   " +
                "31.Welcome-to-the-city Task31   " +
                "\n32.Convert-a-number-to-a-string Task32   " +
                "33.Opposite Num(String)Task33   " +
                "34.StringReverser Task34" );
    }
}
