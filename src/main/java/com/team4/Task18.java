//Task 18 (Opposite number)
package com.team4;
public class Task18
    {
        public static int opposite(int number)
        {
            return number * -1;
        }

        public static void execute(){
            System.out.println("Input your number ");
            int n28 = MyMain.scanner.nextInt();
            System.out.println(Task18.opposite(n28));
        }
    }