//Task 22 (How old will I be in 2099?)

public class AgeDiff {
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
}
