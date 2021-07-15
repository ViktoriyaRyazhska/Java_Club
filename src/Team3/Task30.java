package Team3;

import java.util.Scanner;

public class Task30 {
    public static String updateLight(String current){
        String [] arr = new String[]{"green","yellow","red"};
        if(current == "green"){
            return arr[1];
        }
        else if(current == "yellow"){
            return arr[2];
        }
        else if(current == "red"){
            return arr[0];
        }
        else
            return "You chose wrong color";
    }
    public static void showFunctionality(){

        System.out.println("This program switches color on traffic light");
        System.out.println("Enter 'green', 'yellow' or 'red' and you will get next color: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = updateLight(str);
        System.out.println("Next traffic light color is : " + result);
    }
}
