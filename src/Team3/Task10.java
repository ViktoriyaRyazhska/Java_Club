package Team3;

import java.util.Scanner;

public class Task10 {
    public static void ageRange(int age){
        int min = 0;
        int max = 0;
        if(age > 14 && age <= 100){
            min = age/2 + 7;
            max = (int)((age - 7)*2);
            System.out.println("age = " + age + " => " + min + "-" + max);
        }
        else if(age > 0 && age <= 14){
            min =(int) (age - 0.1 * age);
            max = (int) (age + 0.1 * age);
            System.out.println("age = " + age + " => " + min + "-" + max);
        }
    }
    public static void showFunctionality(){
        System.out.println("It's the 'recommended' age range in which to date someone");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter your age :");
        int n = i.nextInt();
        ageRange(n);
    }

}
