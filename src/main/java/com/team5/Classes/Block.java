package com.team5.Classes;


//Task 6 of Classes Tasks
public class Block {
    private int width;
    private int height;
    private int length;

    public int getVolume(){
        int volume = width * height * length;
        System.out.println(volume);
        return volume;
    }

    public int getSurfaceArea(){
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

    public Block(int[] array) {
        width = array[0];
        length = array[1];
        height = array[2];
    }
}

