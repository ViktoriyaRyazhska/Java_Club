package Team3;

import java.util.Scanner;

public class SwitchData {

    public static void getSwitchData(int number){
        switch (number){
            case (1):
                Task1.showFunctionality();
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
                Scanner i = new Scanner(System.in);
                System.out.println("Enter Int number :");
                int n = i.nextInt();
                System.out.println("Binary from Int "+ n + " = "
                        + Task6.toBinary(n));
            }
                break;
            case (7):
                Task7.showFunctionality();
                break;
            case (8):
                break;
            case (9):
                break;

            default:
                System.out.println("Main class don't have " + number + " task");
                break;
        }
    }
}
