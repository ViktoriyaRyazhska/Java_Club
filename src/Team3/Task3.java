package Team3;


import java.util.Scanner;

public class Task3  {

    public static int  getVolumeOfCuboid(int length, int width, int height) {
        return  length*width*height;
    }

    public static void showFunctionality(){
        System.out.println("This program calculates volume of the cuboid using length, width, height");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter length :");
        int first = i.nextInt();
        System.out.println("Enter width :");
        int second = i.nextInt();
        System.out.println("Enter height :");
        int third = i.nextInt();
        double multiple = getVolumeOfCuboid(first,second,third);

        System.out.println("volume of the cuboid: "+ multiple );
    }
}











