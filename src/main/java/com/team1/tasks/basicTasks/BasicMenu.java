package com.team1.tasks.basicTasks;

public class BasicMenu {

    public void menu(int task) {
        switch (task) {
            case 1:
                System.out.println("You chose task 1");
                BasicTask1 basicTask1 = new BasicTask1();
                basicTask1.execute();
                break;
            case 2:
                System.out.println("You choose task 2");
                BasicTask2 basicTask2 = new BasicTask2();
                basicTask2.execute();
                break;
            case 3:
                System.out.println("You choose task 3");
                BasicTask3 basicTask3 = new BasicTask3();
                basicTask3.execute();
                break;
            case 4:
                System.out.println("You choose task 4");
                BasicTask4 basicTask4 = new BasicTask4();
                basicTask4.execute();
                break;
            case 5:
                System.out.println("You choose task 5");
                BasicTask5 basicTask5 = new BasicTask5();
                basicTask5.execute();
                break;
            case 6:
                System.out.println("You choose task 6");
                BasicTask6 basicTask6 = new BasicTask6();
                basicTask6.execute();
                break;
            case 7:
                System.out.println("You choose task 7");
                BasicTask7 basicTask7 = new BasicTask7();
                basicTask7.execute();
                break;
            case 8:
                System.out.println("You choose task 8");
                BasicTask8 basicTask8 = new BasicTask8();
                basicTask8.execute();
                break;
            case 9:
                System.out.println("You choose task 9");
                BasicTask9 basicTask9 = new BasicTask9();
                basicTask9.execute();
                break;
            case 10:
                System.out.println("You choose task 10");
                BasicTask10 basicTask10 = new BasicTask10();
                basicTask10.execute();
                break;
            case 11:
                System.out.println("You choose task 11");
                BasicTask11 basicTask11 = new BasicTask11();
                basicTask11.execute();
                break;
            default:
                System.out.println("There is no" + task + "task in this group");
                task = -1;
                break;
        }

    }

    public void printListOfTasks() {
        System.out.println("Input number of task!");
        System.out.println("Choose the task:" + "\nTask1 Press 1,"
                + " Task2 Press 2,"
                + " Task3 Press 3,"
                + " Task4 Press 4,"
                + "\nTask5 Press 5,"
                + " Task6 Press 6,"
                + " Task7 Press 7,"
                + " Task8 Press 8,"
                + "\nTask9 Press 9,"
                + " Task10 Press 10,"
                + " Task11 Press 11.");
    }
}
