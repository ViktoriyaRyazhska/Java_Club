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
            case 12: System.out.println("You choose task 12");BasicTask12 basicTask12 = new BasicTask12(); basicTask12.execute();break;
            case 13: System.out.println("You choose task 13");Fraction fraction = new Fraction(); fraction.execute();break;
            case 14: System.out.println("You choose task 14");LombokEncapsulation lombokEncapsulation=new LombokEncapsulation();lombokEncapsulation.execute();break;
            case 15: System.out.println("You choose task 15");StaticElectrickery staticElectrickery = new StaticElectrickery(sc);staticElectrickery.execute();break;
            case 16: System.out.println("You choose task 16");FilteringEvenNumbers filteringEvenNumbers = new FilteringEvenNumbers(sc); filteringEvenNumbers.execute(); break;
            case 17: System.out.println("You choose task 17");InteractiveDictionary interactiveDictionary = new InteractiveDictionary(sc); interactiveDictionary.execute(); break;
            case 18: System.out.println("You choose task 18");PushAnObjectIntoArray pushAnObjectIntoArray = new PushAnObjectIntoArray(sc);  pushAnObjectIntoArray.execute(); break;
            case 19: System.out.println("You choose task 19");UnfinishedLoop unfinishedLoop = new UnfinishedLoop(sc); unfinishedLoop.execute(); break;
            case 20: System.out.println("You choose task 20");ConvertBoolToString convertBoolToString=new ConvertBoolToString(sc);convertBoolToString.execute();break;
            case 21: System.out.println("You choose task 21");DoIGetBonus doIGetBonus=new DoIGetBonus(sc); doIGetBonus.execute();break;
            case 22: System.out.println("You choose task 22");HowOldInFuture howOldInFuture=new HowOldInFuture(sc);howOldInFuture.execute();break;
            case 23: System.out.println("You choose task 23");IsDivisible isDivisible=new IsDivisible(sc);isDivisible.execute();break;
            case 24: System.out.println("You choose task 24");MathOperations mathOperations=new MathOperations(sc);mathOperations.execute();break;
            case 25: System.out.println("You choose task 25");OppositeNum oppositeNum = new OppositeNum(sc); oppositeNum.execute();break;
            case 26: System.out.println("You choose task 26");RockPaperScissors rockPaperScissors=new RockPaperScissors(sc);rockPaperScissors.execute();break;
            case 27: System.out.println("You choose task 27");Averages averages= new Averages(sc); averages.execute(); break;
            case 28: System.out.println("You choose task 28");CatDogYearsCounter catDogYearsCounter = new CatDogYearsCounter(sc); catDogYearsCounter.execute(); break;
            case 29: System.out.println("You choose task 29");ReversedSequence reversedSequence= new ReversedSequence(sc); reversedSequence.execute(); break;
            case 30: System.out.println("You choose task 30");SheepCounter sheepCounter = new SheepCounter(sc); sheepCounter.execute(); break;
            case 31: System.out.println("You choose task 31");StringRepeater stringRepeater = new StringRepeater(sc); stringRepeater.execute(); break;
            case 32: System.out.println("You choose task 32");Hello hello = new Hello(sc); hello.execute(); break;
            case 33: System.out.println("You choose task 33");NumToStrConv numToStrConv = new NumToStrConv(sc);numToStrConv.execute(); break;
            case 34: System.out.println("You choose task 34");OppositeNumStr oppositeNumStr = new OppositeNumStr(sc); oppositeNumStr.execute(); break;
            case 35: System.out.println("You choose task 35");StringReverser stringReverser = new StringReverser(sc); stringReverser.execute(); break;
            case 36: System.out.println("You choose task 36");God god=new God(); god.execute(); break;

            default: System.out.println("There is no" + task + "task in this group");task = -1;break;
        }

    }

    public void printListOfTasks() {
        System.out.println("Input number of task!");
        System.out.println();
        System.out.println("Choose the task:");
        System.out.println();
        System.out.println("01.Basic 1     "
                + "02.Basic 2     "
                + "03.Basic 3     "
                + "04.Basic 4     "
                + "\n05.Basic 5     "
                + "06.Basic 6     "
                + "07.Basic 7     "
                + "08.Basic 8    "
                + "\n09.Basic 9     "
                + "10.Basic 10    "
                + "11.Basic 11    "
                + "12.Basic 12    "
                + "\n\n13.Fractions classes     " +
                "14.Lombok encapsulation     " +
                "\n15.Fixme Static Electrickery     " +
                "\n\n16.Filtering-even-numbers-bug-fixes     " +
                "17.Interactive Dictionary     " +
                "\n18.Push An Object Into Array     " +
                "19.UnfinishedLoop     " +
                "\n\n20.Convert Bool To String     " +
                "21.Do I Get Bonus     " +
                "22.How-old-will-i-be-in-2099     " +
                "\n23.Is Divisible     " +
                "24.Math Operations     " +
                "25.Opposite Num     " +
                "26.RockPaperScissors     " +
                "\n\n27.Averages     " +
                "28.CatDog Years Counter    " +
                "29.Reversed Sequence     " +
                "\n30.Sheep Counter     " +
                "31.StringRepeater     " +
                "\n\n32.Welcome-to-the-city     " +
                "33.Convert-a-number-to-a-string     " +
                "\n34.Opposite Num(String)    " +
                "35.StringReverser     "+
                "\n\n36.Basic-subclasses-adam-and-eve  ");
    }
}
