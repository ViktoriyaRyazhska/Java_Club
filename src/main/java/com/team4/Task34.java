//Task 34 (Get the mean of an array)
package com.team4;
public class Task34{

  public static int getAverage(int[] marks){
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }

    return sum / marks.length;
  }

  public static void execute(){
    System.out.println("Input how many marks ");
    int marks = MyMain.scanner.nextInt();
    System.out.println("Input your marks ");
    int[] n55 = new int[marks];
    for(int i = 0; i < marks; i++){
      n55[i] = MyMain.scanner.nextInt();
    }
    System.out.println(Task34.getAverage(n55));
  }
}
