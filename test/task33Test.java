import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task33Test {

  @Test
  void testHumanYearsCatYearsDogEquals1() {

    int[] expected = new int[] {1, 15, 15};

    int[] actual = task33.humanYearsCatYearsDogYears(1);

    assertArrayEquals(expected, actual);

  }

  @Test
  void testHumanYearsCatYearsDogYearsEqual2() {

    int[] expected = new int[] {2, 24, 24};

    int[] actual = task33.humanYearsCatYearsDogYears(2);

    assertArrayEquals(expected, actual);

  }

  @Test
  void testHumanYearsCatYearsDogYearsOver2() {

    int[] expected = new int[] {22, 104, 124};

    int[] actual = task33.humanYearsCatYearsDogYears(22);

    assertArrayEquals(expected, actual);

  }
}