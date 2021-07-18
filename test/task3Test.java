import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task3Test {

    @Test
    void getVolumeOfCuboid() {
      double expected = 4;
      double actual = task3.getVolumeOfCuboid(2.0,2.0,1.0);
      assertEquals(expected,actual);
    }
}