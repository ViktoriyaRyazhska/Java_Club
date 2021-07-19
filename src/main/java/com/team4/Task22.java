//Task 22 (How old will I be in 2099?)
package com.team4;
public class Task22 {
  public static String CalculateAge(int birth, int yearTo) {
    if(birth - yearTo == 1)
      return "You will be born in " + (birth - yearTo) + " year.";
    else if(birth > yearTo)
      return "You will be born in " + (birth - yearTo) + " years.";
    else if(yearTo - birth == 1)
      return "You are " + (yearTo - birth) + " year old.";
    else if(birth < yearTo)
      return "You are " + (yearTo - birth) + " years old.";
    else
      return "You were born this very year!";
  }

  public static void execute(){
    System.out.println("Input your birth and yearTo ");
    int n35 = MyMain.scanner.nextInt();
    int n36 = MyMain.scanner.nextInt();
    System.out.println(Task22.CalculateAge(n35, n36));
  }
}
