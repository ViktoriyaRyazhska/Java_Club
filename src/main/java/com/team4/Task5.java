//Task 5 (Jenny's secret message)
package com.team4;
public class Task5 {
  public static String greet(String name) {

    if(name.equals("Johnny")){
      return "Hello, my love!";
    }
    return String.format("Hello, %s!", name);

  }
}
