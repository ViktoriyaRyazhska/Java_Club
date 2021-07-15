//Task 17 (Building blocks)

public class Block{
  private int width;
  private int length;
  private int height;
  private int volume;
  private int surface_area;

  public Block(int[] params) {
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
}
