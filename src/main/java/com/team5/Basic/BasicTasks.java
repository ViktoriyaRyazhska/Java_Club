package com.team5.Basic;

public class BasicTasks {

    public int task1(int i) {
        int result = i*i;
        System.out.println(result);
        return result;
    }
    public void task4(int a, int b){
        System.out.println(a%b==0);

    }
    public void task5 (String name) {
        if(name.equals("Johnny")){
            System.out.println("Hello, my love!");
        }else{
            System.out.println(String.format("Hello, %s!", name));
        }
    }
    public void task6(int a) {
        System.out.println(Integer.parseInt(Integer.toBinaryString(a)));

    }
    public int task7(int h, int m, int s){
        int result = (h * 360000) + (m * 60000) + (s * 1000);
        System.out.println(result);
        return result;
    }

    public int task8(int number){
        int result;

        if(number % 100 == 0){
            result = number / 100;
        }else{
            result = (number / 100) + 1;
        }

        return result;
    }

    public int task9(final int x){
        int result = x;

        if(result > 0){
            result = x - (x * 2);
        }

        return result;
    }

}
