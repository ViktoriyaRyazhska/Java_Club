package com.team5.Conditions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionsRealizations {

    public static void conditionsRealization(){
        ConditionsTasks conditionsTasks = new ConditionsTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 18: {

            } case 19:{

            } case 20:{

            } case 21:{

            }
            case 22:{
                System.out.print("Enter birth year - ");
                int a = input.nextInt();
                System.out.print("Enter year");
                int b = input.nextInt();
                conditionsTasks.task22(a,b);
            }
            case 23:{
                System.out.print("Player 1");
                String p1=input.next();
                System.out.println("Player 2");
                String p2=input.next();
                conditionsTasks.task23(p1,p2);
                break;
            }
            case 24:{
                System.out.println("Enter oper-");
                String oper=input.next();
                System.out.println("Enter num1");
                int num1= input.nextInt();
                System.out.println("Enter num2");
                int num2= input.nextInt();
                conditionsTasks.task24(oper,num1,num2);
                break;
            }
            case 25:{
                System.out.print("Enter number of petals 1 - ");
                int a= input.nextInt();
                System.out.print("Enter number of petals 2 - ");
                int b= input.nextInt();
                conditionsTasks.task25(a,b);
                break;
            }
            case 26:{

            } case 27:{

            } case 28:{

            } case 29:{

            } case 30:{

            } case 31:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
