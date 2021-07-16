package com.team5.Loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoopsTasks {
    Scanner sc = new Scanner(System.in);
    public int task13(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += i;
        }
        return result;
    }

    public long[] task14(int g, long m, long n){
        long[] result = new long[0];
        //tam jopa
        //i need help
        return result;
    }

    public int task15(int sticks){
        return sticks % 4 == 0 ? 1 : sticks % 4;
    }
    public void task40(int n){
        int [] arr = new int[n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter arr elem"+(i+1)+" = ");
            arr[i]= sc.nextInt();
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of pos elem = "+sum);
    }
    public void task41(int a){
        ArrayList<String> rev = new ArrayList<String>();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter part"+(i+1)+" = ");
            String s = sc.next();
            rev.add(s);
        }
        Collections.reverse(rev);
        System.out.println("Reversed parts - "+rev);
    }
    public  void task42(int fa, int so){
        System.out.println(Math.abs((so*2)-fa));
    }
    public void task43 (int num){
        System.out.println((int)Math.pow(Math.round(Math.sqrt(num)),2));
    }
}

