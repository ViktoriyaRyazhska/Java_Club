import java.util.Scanner;

public class Block {

    private int width;
    private int length;
    private int height;
    private int volume;
    private int surface_area;

    public Block(int [] params) {
        this.width = params[0];
        this.length = params[1];
        this.height = params[2];


    }

    public int getWidth() {
        return width ;
    }

    public int getLength() {
        return length ;
    }

    public int getHeight() {
        return height ;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return  2 * (width * height + width * length + length * height);
    }
    public static void execute(Scanner sc) {
        System.out.println("This program calculate volume and surface area ");

    }
}
