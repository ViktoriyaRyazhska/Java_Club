package com.team5.Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockTest {

    @Test
    void getVolume() {
        Block block = new Block(5, 6, 3);
        int actual = block.getVolume();
        assertEquals(90, actual);
    }

    @Test
    void getSurfaceArea() {
        Block block = new Block(5, 6, 3);
        int actual = block.getSurfaceArea();
        assertEquals(126, actual);
    }
}
