import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class task71Test {

  @Test
  void testFilterOddNumber() {

    List<Integer> expected = List.of(5, 3, 1, 9);

    List<Integer> actual = task71.filterOddNumber(List.of(10, 2, 5, 4, 4, 3, 1, 6, 9));

    assertEquals(expected, actual);

  }

  @Test
  void testEmptyListToFilterOddNumber() {

    assertThrows(NoSuchElementException.class,
            () -> task71.filterOddNumber(List.of()), "This program can't filter empty list");

  }
}