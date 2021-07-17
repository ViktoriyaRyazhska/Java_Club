import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task65Test {

  @Test
  void twoSort() {

    String expected = "N***o***t***e***b***o***o***k";

    String actual = task65.twoSort(new String[] {"Notebook", "Zero", "Phone", "World"});

    assertEquals(expected, actual);

  }
}