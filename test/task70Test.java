import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class task70Test {

  @Test
  void testCreateList() {

    List<Integer> expected = List.of(1, 2, 3, 4);

    List<Integer> actual = task70.CreateList(4);

    assertEquals(expected, actual);

  }
}