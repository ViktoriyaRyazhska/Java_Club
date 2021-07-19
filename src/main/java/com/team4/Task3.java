//Task 3 (Volume of a Cuboid)
package com.team4;
public class Task3 {

  public static double getVolumeOfCuboid(final double length, final double width, final double height) {

    return length*width*height;
  }

  public static void execute(){
    System.out.println("Input length, width and height :");
    double n3 = MyMain.scanner.nextDouble();
    double n4 = MyMain.scanner.nextDouble();
    double n5 = MyMain.scanner.nextDouble();
    System.out.println(Task3.getVolumeOfCuboid(n3, n4, n5));
  }
}
