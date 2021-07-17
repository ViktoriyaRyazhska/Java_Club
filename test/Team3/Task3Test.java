package Team3;

import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void getVolumeOfCuboid() {

        int actual = Task3.getVolumeOfCuboid(2,2,2);
        int expected = 8;
        assertEquals(expected,actual);
    }
}