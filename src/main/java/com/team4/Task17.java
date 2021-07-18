//Task 17 (Building blocks)
package com.team4;
public class Task17{
  private int width;
  private int length;
  private int height;
  private int volume;
  private int surface_area;

  public Task17(int[] params) {
    width = params[0];
    length = params[1];
    height = params[2];

    volume = width * length * height;
    surface_area = 2 * (width * length + width * height + length * height);
  }

  public int getWidth() {
    return width;
  }

  public int getLength() {
    return length;
  }

  public int getHeight() {
    return height;
  }

  public int getVolume() {
    return volume;
  }

  public int getSurfaceArea() {
    return surface_area;
  }

  public static void execute(){
    System.out.println("input your width, length and height ");
    int[] params = new int[3];
    params[0] = MyMain.scanner.nextInt();
    params[1] = MyMain.scanner.nextInt();
    params[2] = MyMain.scanner.nextInt();
    Task17 task17 = new Task17(params);
    System.out.println("There are your parameters (w, l, h, Volume and SurfaceArea) : ");
    System.out.println(task17.getWidth());
    System.out.println(task17.getLength());
    System.out.println(task17.getHeight());
    System.out.println(task17.getVolume());
    System.out.println(task17.getSurfaceArea());
  }
}
