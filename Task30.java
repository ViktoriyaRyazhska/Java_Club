//Task 30 (Thinkful - Logic Drills: Traffic light)

public class TrafficLights {

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
