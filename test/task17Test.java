
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class task17Test {

  private static task17 block;

  @BeforeAll
  void setUp() {
    block = new task17(new int[] {10, 20, 30});
  }

  @Test
  void testGetWidth() {

    int expected = 10;

    int actual = block.getWidth();

    assertEquals(expected, actual);

  }

  @Test
  void testGetLength() {

    int expected = 20;

    int actual = block.getLength();

    assertEquals(expected, actual);

  }

  @Test
  void testGetHeight() {

    int expected = 30;

    int actual = block.getHeight();

    assertEquals(expected, actual);

  }

  @Test
  void testGetVolume() {

    int expected = 6000;

    int actual = block.getVolume();

    assertEquals(expected, actual);

  }

  @Test
  void testGetSurfaceArea() {

    int expected = 2200;

    int actual = block.getSurfaceArea();

    assertEquals(expected, actual);

  }


}