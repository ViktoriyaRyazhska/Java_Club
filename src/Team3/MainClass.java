package Team3;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        String check = "S";

        while (!check.equals("E")){
            System.out.println("For read instruction push 'Y' ");
            System.out.println("Or to go to tasks push any another button ");

            Scanner i = new Scanner(System.in);
            String s = i.nextLine();

            if(s.equals("Y")){
                Instruction.getInstruction();                    //Show instruction
            }
            System.out.println("Enter number of task : ");

            int num = i.nextInt();
            SwitchData.getSwitchData(num);                       // Void Switch

            System.out.println();
            System.out.println("If you want stop program - push 'E'");
            System.out.println("Or to continue working with program push any another button");
            Scanner t = new Scanner(System.in);
            check = t.nextLine();
        }

        System.out.println("Finish");
    }
}
