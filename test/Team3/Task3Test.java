package Team3;

import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void getVolumeOfCuboid() {

        double actual = Task3.getVolumeOfCuboid(2,2,2);
        double expected = 8;
        double delta = 0.0001;
        assertEquals(expected,actual,delta);
    }
    public void getVolumeOfCuboid1(){
        double actual = Task3.getVolumeOfCuboid(2.3,4,3);
        double expected = 27.6;
        double delta = 0.0001;
        assertEquals(expected,actual,delta);
    }
}