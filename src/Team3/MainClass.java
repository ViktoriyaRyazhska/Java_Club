package Team3;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        String check = "S";

        while (!check.equals("E")){
            System.out.println("For read instruction push 'Y' ");

            Scanner i = new Scanner(System.in);
            String s = i.nextLine();

            if(s.equals("Y")){
                Instruction.getInstruction();                    //Show instruction
            }
            System.out.println("Enter number of task : ");

            int num = i.nextInt();
            SwitchData.getSwitchData(num);                       // Void Switch

            System.out.println("If you want stop program - push 'E'");
            Scanner t = new Scanner(System.in);
            check = t.nextLine();
        }

        System.out.println("Finish");
    }
}
