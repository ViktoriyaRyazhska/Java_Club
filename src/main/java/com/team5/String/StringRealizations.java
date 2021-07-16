package com.team5.String;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringRealizations {

    public static void StringRealization(){
        StringTasks stringTasks = new StringTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 51: {

            } case 52:{

            } case 53:{

            } case 54:{

            }
            case 55:{
                System.out.print("Enter string with dots - ");
                String str = input.next();
                stringTasks.task55(str);
                break;
            }
            case 56:{
                System.out.print("Enter name - ");
                String str = input.next();
                stringTasks.task56(str);
                break;
            }
            case 57:{
                System.out.print("Enter Sting with spaces - ");
                String str = input.next();
                stringTasks.task57(str);
                break;
            }
            case 58:{
                System.out.println("Enter Sting with same num of elem");
                System.out.print("Enter str1 - ");
                String str1 = input.next();
                System.out.print("Enter str2 - ");
                String str2 = input.next();
                System.out.print("Enter str3 - ");
                String str3 = input.next();
                stringTasks.task58(str1,str2,str3);
                break;
            }
            case 59:{

            } case 60:{

            } case 61:{

            } case 62:{

            } case 63:{
                System.out.println("Test");
            } case 64:{

            } case 65:{

            } case 66:{

            } case 67:{

            } case 68:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
