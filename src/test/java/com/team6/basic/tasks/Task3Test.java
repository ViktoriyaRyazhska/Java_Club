package com.team6.basic.tasks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task3Test extends TestCase {

    @Test
    public void testCuboidVolumeTrue() {
        Assert.assertEquals(Task3.cuboidVolume(4,2,1), Task3.cuboidVolume(1,2,4));
    }

    @Test
    public void testCuboidVolumeFall(){
        Assert.assertNotEquals(Task3.cuboidVolume(5, 5, 5), Task3.cuboidVolume(1, 2, 3));
    }
}