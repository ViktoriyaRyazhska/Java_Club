package com.team6.classes;

public class Task6 {
    private final int width;
    private final int length;
    private final int height;

    public Task6(int[] m) {
        this.width = m[0];
        this.length = m[1];
        this.height = m[2];
    }

    public int getWidth() {
        return this.width;
    }
    public int getLength() {
        return this.length;
    }
    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return this.width * this.length * this.height;
    }

    public int getSurfaceArea() {
        return this.width*2*this.length + this.length*2*this.height + this.height*2*this.width;
    }
}
