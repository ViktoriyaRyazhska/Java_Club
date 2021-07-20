package com.team5.Classes;


import com.team5.Menu.Input;

//Task 6 of Classes Tasks
public class Block {
    private int width;
    private int height;
    private int length;

    public int getVolume(){
        System.out.print("Volume - ");
        int volume = width * height * length;
        System.out.println(volume);
        return volume;
    }

    public int getSurfaceArea(){
        System.out.print("Total surface area - ");
        int sa = 2 * (width * height + height * length + width * length);
        System.out.println(sa);
        return sa;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public Block(int width, int length, int height) {
        System.out.println("This method returns the area of the total surface and the volume of the parallelepiped," +
                " the dimensions of which were specified when creating the object ....");
        this.width = width;
        this.length = length;
        this.height = height;
    }
}
