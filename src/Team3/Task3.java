package Team3;


import java.util.Scanner;

public class Task3  {

    public static double  getVolumeOfCuboid(double length, double width, double height) {
        return  length*width*height;
    }

    public static void showFunctionality(){
        System.out.println("This program calculates volume of the cuboid using length, width, height");
        Scanner i = new Scanner(System.in);
        System.out.println("Enter length :");
        double first = i.nextDouble();
        System.out.println("Enter width :");
        double second = i.nextDouble();
        System.out.println("Enter height :");
        double third = i.nextDouble();
        double multiple = getVolumeOfCuboid(first,second,third);

        System.out.println("volume of the cuboid: "+ multiple );
    }
}











