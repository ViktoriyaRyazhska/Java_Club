package Team3;

import java.util.Scanner;

public class Task22 {
    public static String calculateAge(int birth, int yearTo) {

       if(birth < yearTo && yearTo - birth != 1){
           return "You are " + (yearTo - birth) + " years old.";
       }

       else if (yearTo - birth == 1){
           return "You are " + 1 + " year old.";
       }

       else if(birth == yearTo){
           return "You were born this very year!";
       }

       else if(birth - yearTo == 1){
           return "You will be born in " + 1 + " year.";
       }

       else {
           return "You will be born in " + (birth - yearTo) + " years.";
       }
    }
    public static void showFunctionality(){
        System.out.println("This program calculates 'How old you will be'\n" +
                " or 'how many years left before your birth");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter you birth year : ");
        int birth = i.nextInt();
        System.out.println("Enter year (future of past) : ");
        int yearTo = i.nextInt();
        System.out.println(calculateAge(birth,yearTo));

    }
}
