package com.team5.Loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopsRealizations {

    public static void loopsRealization(){
        LoopsTasks loopsTasks = new LoopsTasks();
        Scanner input = new Scanner(System.in);

        int caseNumber = 0;
        try {
            caseNumber = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Incorrect value");
        }        switch (caseNumber) {
            case 32: {

            } case 33:{

            } case 34:{

            } case 35:{

            } case 36:{

            } case 37:{

            } case 38:{

            } case 39:{

            }
            case 40:{
                System.out.print("Enter num of arr - ");
                int n = input.nextInt();
                loopsTasks.task40(n);
                break;
            }
            case 41:{
                System.out.print("Enter num of parts - ");
                int a = input.nextInt();
                loopsTasks.task41(a);
                break;
            }
            case 42:{
                System.out.print("Enter father years - ");
                int a = input.nextInt();
                System.out.print("Enter son years - ");
                int b = input.nextInt();
                loopsTasks.task42(a,b);
                break;
            }
            case 43:{
                System.out.print("Enter number - ");
                int a = input.nextInt();
                loopsTasks.task43(a);
                break;
            }
            case 44:{

            } case 45:{

            } case 46:{

            } default:
                System.out.println("Incorrect value!");
        }
    }
}
