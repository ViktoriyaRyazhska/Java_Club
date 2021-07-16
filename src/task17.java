import java.util.Scanner;

public class task17 {

    private int width;
    private int length;
    private int height;
    private int volume;
    private int surface_area;

    public task17(int [] params) {
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
        System.out.println("This program takes an array as an argument, this will contain 3 integers \n" +
                "of the form [width, length, height] from which the Block should be created");
        System.out.println("And calculates surface area and volume: ");
        System.out.println("Enter width: ");
        int width = sc.nextInt();
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter height: ");
        int height = sc.nextInt();
        task17 block = new task17(new int[] {width, length, height});
        System.out.println("Here your surface area: " + block.getSurfaceArea() + " and your volume: " + block.getVolume());

    }
}
