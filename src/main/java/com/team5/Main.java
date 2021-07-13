package com.team5;

import com.team5.Basic.BasicClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        BasicClass basicClass = new BasicClass();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:{
                int i = sc.nextInt();
                basicClass.doubleInteger(i);
            }
            case 7:{
                System.out.println("Enter hours");
                int i = sc.nextInt();
                System.out.println("Enter minutes");
                int j = sc.nextInt();
                System.out.println("Enter seconds");
                int y = sc.nextInt();
                basicClass.task7(i, j, y);
            }
        }
    }
}