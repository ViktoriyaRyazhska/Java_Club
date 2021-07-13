import java.util.Scanner;

public class task36 {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int result = 0;
    for (int i = 0; i < arrayOfSheeps.length; i++) {
      if (arrayOfSheeps[i] != null && arrayOfSheeps[i])
        result++;
    }
    return result;
  }

  public static void execute(Scanner sc) {
    System.out.println("Consider an array/list of sheep where some sheep may " +
            "be missing from their place. \n" +
            "This program counts the number of sheep present in the array (true means present).");
    System.out.println("Enter size of array: ");
    int size = sc.nextInt();
    Boolean[] sheep = new Boolean[size];
    for (int i = 0; i < size; i++) {
      System.out.println("Enter true or false: ");
      String str = sc.next().toLowerCase();
      if (str.equals("true")) {
        sheep[i] = true;
      } else if (str.equals("false")) {
        sheep[i] = false;
      } else {
        throw new IllegalArgumentException("Wrong value!!!");
      }
    }
    int result = new task36().countSheeps(sheep);
    System.out.println("There is/are " + result + " sheep");
  }
}
