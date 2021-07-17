package com.team1.tasks.classesTasks;

import com.team1.IRunTask;

import java.util.Arrays;

public class Block implements IRunTask {
    public Block(int[] arr) {
        this.arr = arr;
    }
    private int[]arr;

    public int getWidth(){
        return arr[0];
    }
    public int getLength(){
        return arr[1];
    }
    public int getHeight(){
        return arr[2];
    }
    public int getVolume(){
        return arr[0]*arr[1]*arr[2];
    }
    public int getSurfaceArea(){
        return (2*arr[0]*arr[2])+(2*arr[1]*arr[0])+(2*arr[2]*arr[1]);
    }

    @Override
    public String toString() {
        return "Block{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public void execute() {
        Block bl=new Block(new int[]{2,2,2});
        System.out.println("Width: "+bl.getWidth());
        System.out.println("Length: "+bl.getLength());
        System.out.println("Height: "+bl.getHeight());
        System.out.println("Volume: "+bl.getVolume());
        System.out.println("Surface Area: "+bl.getSurfaceArea());
    }
}