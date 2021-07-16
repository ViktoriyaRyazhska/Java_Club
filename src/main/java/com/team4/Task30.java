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

}
