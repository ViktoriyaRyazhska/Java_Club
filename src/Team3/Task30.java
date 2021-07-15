package Team3;

import java.util.Scanner;

public class Task30 {
    public static String updateLight(String current){
        String [] arr = new String[]{"green","yellow","red"};
        if(current.equals("green")){
            return arr[1];
        }
        else if(current.equals("yellow")){
            return arr[2];
        }
        else if(current.equals("red")){
            return arr[0];
        }
        else
            return "You chose wrong color";
    }
    public static void showFunctionality(){

        System.out.println("This program switches color on traffic light");
        Scanner in = new Scanner(System.in);
        String s = "S";
        while (!s.equals("E")){
            System.out.println("Enter 'green', 'yellow' or 'red' and you will get next color: ");
            String str = in.nextLine();
            System.out.println("Next traffic light color is : " + updateLight(str));
            System.out.println("If you want close the program push 'E'");
            s = in.nextLine();
        }
    }
}
