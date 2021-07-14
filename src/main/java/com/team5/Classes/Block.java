package com.team5.Classes;


//Task 6 of Classes Tasks
public class Block {
    private int width;
    private int height;
    private int length;

    public int getVolume(){
        return width * height * length;
    }

    public int getSurfaceArea(){
        return 2 * (width * height + height * length + width * length);
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

