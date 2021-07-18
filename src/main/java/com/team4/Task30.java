//Task 30 (Thinkful - Logic Drills: Traffic light)
package com.team4;
public class Task30 {

  public static String updateLight(String current) {
    switch(current){
        case "green":
        return "yellow";
        case "yellow":
        return "red";
        case "red":
        return "green";
    }

    return "";
  }

    public static void execute(){
        System.out.println("Input your current light of traffic light ");
        String n50 = MyMain.scanner.nextLine();
        System.out.println(Task30.updateLight(n50));
    }
}
