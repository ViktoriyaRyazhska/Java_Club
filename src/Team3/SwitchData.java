package Team3;

import java.util.Scanner;

public class SwitchData {

    public static void getSwitchData(int number){
        switch (number){
            case (1):
                //Task1.showFunctionality();
                break;
            case (2): {
                Task2.showFunctionality();
            }
            break;
            case (3):
                Task3.showFunctionality();
                break;
            case (4):
                break;
            case (5):
                break;
            case (6):
            {
                /*Scanner i = new Scanner(System.in);
                System.out.println("Enter Int number :");
                int n = i.nextInt();
                System.out.println("Binary from Int "+ n + " = "
                        + Task6.toBinary(n));*/
            }
            break;
            case (7):
                Team7.showFunctionality();
                break;
            case (8):
                break;
            case (9):
                break;
            case (10):
                break;
            case (11):
                Task11.showFunctionality();
                break;
            case (12):
                break;
            case (13):
                break;
            case (14):
                break;
            case (15):

                break;
            case (16):
                break;
            case (17):
                break;
            case (18):
                break;
            case (19):
                Task19.showFunctionality();
                break;
            case (20):
                break;
            case (21):
                break;
            case (22):
                break;
            case (23):
                Task23.showFunctionality();
                break;
            case (24):
                break;
            case (25):
                break;
            case (26):
                break;
            case (27):
                Task27.showFunctionality();
                break;
            case (28):
                break;
            case (29):
                break;
            case (30):
                break;
            case (31):

                break;
            default:
                System.out.println("Main class don't have " + number + " task");
                break;
        }
    }
}
